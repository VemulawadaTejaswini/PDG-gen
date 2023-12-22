import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		HashMap<String,String> hm = new HashMap<String,String>();
		while(true){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			for(int i = 0;i < n;i++){
				hm.put(scan.next(),scan.next());
			}
			n = scan.nextInt();
			for(int i = 0;i < n;i++){
				String s = scan.next();
				String t = hm.get(s);
				if(t == null){
					System.out.print(s);
				}else{
					System.out.print(t);
				}
			}
			System.out.println();
		}
	}
}