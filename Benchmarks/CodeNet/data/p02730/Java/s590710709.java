import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();//奇数である文字列
			char []s = new char[S.length()];
			char []x = new char[S.length()];
			s = S.toCharArray();
			
			int ok1 = 0;
			int ok2 = 0;
			int ok3 = 0;
			
			if(kaibunn(s)) {
				ok1=1;
				//System.out.println(ok1);
			}
			int N = S.length();
			String S2 = S.substring(0, (N-1)/2);
			char[] s2 = S2.toCharArray();
			if(kaibunn(s2)){
				ok2 =1;
				//System.out.println(ok2);
			}
			String S3 = S.substring((N+3)/2-1, N);
			char[] s3  = S3.toCharArray();
			if(kaibunn(s3)) {
				ok3=1;
				//System.out.println(ok3);
			}
			
			System.out.println(ok1==1&&ok2==1&&ok3==1?"Yes":"No");
			
			
			
			
			
			
		}
		
		
	}
	
	
	private static boolean kaibunn(char[]s) {//文字列が回文かどうか
		boolean hante =true;
		char []x = new char[s.length];
		for(int i = s.length-1;i>=0;i--) {
			x[i] = s[s.length-1-i];
		}
		
		for(int i = 0;i<s.length;i++) {
			//System.out.println(s[i]);
			//System.out.println(x[i]);
			if(s[i]!=x[i]) {
				hante = false;
				break;
			}
		}	
		return hante;
		
	}
		
}
