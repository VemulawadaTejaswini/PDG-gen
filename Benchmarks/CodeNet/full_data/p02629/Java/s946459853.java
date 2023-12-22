import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			
			long N = scan.nextLong();
			
			int count = 1;
			long left = 1;
			long right = 26;
			
			while(true) {
				if(left<=N&&N<=right) {
					//System.out.println(count);
					break;
				}
				count++;
				left = right+1;
				right = right+(long)Math.pow(26, count);
				//System.out.println(left+" "+right+" "+count);
			}
			
			
			StringBuffer sb = new StringBuffer();
			
			count--;
			while(count>0){
				
				long m = (long)Math.pow(26, count);
				
				if(count==1) {
					long ans = N/m;
					//System.out.println(ans);
					long bans = N%m;
					//System.out.println(bans);
					char d = (char)('`'+ans);
					//System.out.println(d);
					sb.append(d);
					
					char s = (char)('`'+bans);
					//System.out.println(s);
					sb.append(s);
					count--;
					
				}else{
					long ans = N/m;
					//System.out.println(ans);
					char d = (char)('`'+ans);
					//System.out.println(d);
					sb.append(d);
					count--;
					N=N%m;
					
					
				}
				
				
				
			}
			
			
			System.out.println(sb.toString());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}
		

}
