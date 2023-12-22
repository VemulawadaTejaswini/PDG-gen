
import java.util.*;
public class Main {
	//0323 start
	
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			int [][] data = new int[8][32];
			for(int i = 0; i < 8; i++){
				long num = Long.parseLong(sc.next(), 16);
				data[i] = parse(num);
			}
			String s = sc.next();
			int [] n9 = parse(Long.parseLong(s, 16));
			//System.out.println(Arrays.toString(n9));
			
			int [] res = new int[32];
			int prev = 0;
			for(int i = 0 ; i < 32; i++){
				int sum = prev;
				for(int j = 0; j < 8; j++){
					sum+= data[j][i];
				}
				//System.out.println("i = " + i + " sum = " + sum +  " prev = " + prev);
				if(sum % 2 == n9[i]){
					res[i] = 0;
					prev = sum / 2;
				}
				else{
					res[i] = 1;
					sum = prev;
					for(int j = 0 ; j < 8; j++){
						sum += (data[j][i] + 1) % 2; 
					}
					prev = sum / 2;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 32; i++){
				sb.append(res[i]);
			}
			sb.reverse();
			long ans = Long.parseLong(sb.toString(), 2);
			System.out.println(Long.toHexString(ans));
			
		}
	}

	private int[] parse(long num) {
		StringBuilder s = new StringBuilder(Long.toBinaryString(num));
		s.reverse();
		int [] res = new int[32];
		for(int i = 0; i < s.length(); i++){
			res[i] = s.charAt(i) - '0';
		}
		return res;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}