import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String S = sc.next();
		String ans="WA";

		if(S.charAt(0)=='A') {
			int count=0;
			int index=0;
			//System.out.println("1");
			for(int i=2; i<=S.length()-2;i++) {
				if(S.charAt(i)=='C') {
					count++;
					index=i;
				}
			}
			if(count==1) {
				//System.out.println("2");
				S=S.substring(1,index)+S.substring(index+1,S.length());
				//System.out.println(S);
				int small=0;
				for(int i=0;i<S.length();i++) {
					if(S.substring(i,i+1).matches("[a-z]")) {
						small++;
					}
				}
				if(small==S.length()) {
					ans="AC";
				}
			}
		}
		System.out.println(ans);

	}
}