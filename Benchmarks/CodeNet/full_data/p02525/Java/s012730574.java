import java.util.Scanner;
public class Main {
	static int acount = 0;
	static int bcount = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		
		while(true){
			int n = Integer.parseInt(sc2.nextLine());
			
			if(n == 0) break;
			else{
				String[] s = sc2.nextLine().split("[\\s]+");
				int x =0;
				acount = 0;
				
				for(int i=0;i<s.length;i++){
					x += Integer.parseInt(s[i]);
				}
				x /= n;
				
				for(int  i=0;i<n;i++){
					int f = Integer.parseInt(s[i]);
					acount += ((f-x)*(f-x))/n;
				}
				System.out.println(Math.sqrt(acount));
			}
		}
	}
			
}