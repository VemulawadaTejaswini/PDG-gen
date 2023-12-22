import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
  
	public static class Binary{
		Binary left, right;

		public Binary(Binary left, Binary right) {
			super();
			this.left = left;
			this.right = right;
		}
		
		@Override
		public String toString(){
			return "(" + (left == null ? "" : left) + "," + (right == null ? "" : right) + ")";
		}
		
		public static Binary add(Binary fst, Binary snd){
			if(fst == null && snd == null){
				return null;
			}else if(fst == null){
				return new Binary(Binary.add(null, snd.left), Binary.add(null, snd.right));
			}else if(snd == null){
				return new Binary(Binary.add(fst.left, null), Binary.add(fst.right, null));
			}else{
				return new Binary(Binary.add(fst.left, snd.left), Binary.add(fst.right, snd.right));
			}
		}
		
		public static Binary mul(Binary fst, Binary snd){
			if(fst == null || snd == null){
				return null;
			}else{
				return new Binary(Binary.mul(fst.left, snd.left), Binary.mul(fst.right, snd.right));
			}
		}
	}
	
	public static Binary parse(char[] input, int start, int end){
		if(start > end){
			return null;
		}
		
		if(input[start] == '('){
			int c_lv = 1;
			int t_pos = -1;
			int c_end = -1;
			for(int pos = start + 1; pos <= end; pos++){
				if(input[pos] == '('){
					c_lv++;
				}else if(input[pos] == ')'){
					c_lv--;
					if(c_lv == 0){
						c_end = pos;
						break;
					}
				}else if(c_lv == 1 && input[pos] == ','){
					t_pos = pos;
				}
			}
			
			return new Binary(parse(input, start + 1, t_pos - 1), parse(input, t_pos + 1, c_end - 1));
		}
		
		return null;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        while(sc.hasNext()){
        	String ops = sc.next();
        	String fst = sc.next();
        	String snd = sc.next();
        	
        	//System.out.println(fst + " " + snd);
        	
        	Binary fst_b = parse(fst.toCharArray(), 0, fst.length() - 1);
        	Binary snd_b = parse(snd.toCharArray(), 0, snd.length() - 1);
        	
        	//System.out.println(fst_b + " " + snd_b);
        	
        	System.out.println(ops.equals("u") ? Binary.add(fst_b, snd_b) : Binary.mul(fst_b, snd_b));
        }
    }
}