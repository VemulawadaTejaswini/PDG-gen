import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
		
			long k = 1;
			int kosuu = 0;
			int count = 0;
			while(true) {
				count++;
				if(count>100000)break;
				
				
				long s = k;
				int kurai = 0;
				while(s/(int)Math.pow(10, kurai)>0) {
					//System.out.println("yea");
					String p = String.valueOf(s);
					if(p.charAt(p.length()-1-kurai)=='4') {
						s+=7*(int)Math.pow(10, kurai);
						
						//System.out.println("ok");
					}
					kurai++;
				}
				k=s;
				//System.out.println(k);

				
				String S = String.valueOf(k);
				int zero=0;int one=0;int two=0;
				char[]u = new char[S.length()];
				for(int i = 0;i<S.length();i++) {
					if(S.charAt(i)=='1') {
						zero++;
						u[i] = '3';
					}
					if(S.charAt(i)=='2') {
						one++;
						u[i]='5';
					}
					if(S.charAt(i)=='3') {
						two++;
						u[i] ='7';
					}
				}
				String an = new String(u);
				long X = Long.valueOf(an);
				
				//System.out.println(X);
				
				
				if(X>N)break;
				
				if(zero>=1&&one>=1&&two>=1) {
					if(N>=X) kosuu++;
				}
				//System.out.println(k);
				
				
				
				k++;
				
				
				
			}
			
			
			
			
			
			System.out.println(kosuu);
			
			
		}
	}
	
	
	
	
	
	
		
	





	
		

}
