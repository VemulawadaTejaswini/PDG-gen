
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			
			String s = sc.next();
			
			int len = s.length();
			
			int cnt=0;
			char[] sChars = s.toCharArray();
			int leftindex=N-1;
			
			int rdcnt=0;
			int whcnt=0;
			for(int i=0;i<N;i++) {
				if(sChars[i]=='W') {
					whcnt++;
				}else {
					rdcnt++;
				}
			}
			
			
			for(int i=0;i<N;i++) {
			
				if(sChars[i]=='W') {
					for(int j=0;j<leftindex-i+1;j++) {
						if(sChars[leftindex-j]=='R') {
							sChars[i]='R';
							sChars[leftindex-j]='W';
							leftindex=leftindex-j-1;
							cnt++;
							break;
						}
					}
					if(cnt>=rdcnt||cnt>=whcnt) {
						break;
					}
				}
				if(leftindex==i) {
					break;
				}	
			}
			System.out.println(cnt);
	}	
}