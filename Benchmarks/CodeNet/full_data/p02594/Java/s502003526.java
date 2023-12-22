import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			
			String s = sc.next();
			
			int len = s.length();
			
			int cnt=0;
			char[] sChars = s.toCharArray();
			int leftindex=len-1;
			
			for(int i=0;i<len;i++) {
				if(leftindex==i) {
					break;
				}				
				if(sChars[i]=='W') {
					for(int j=0;j<leftindex;j++) {
						if(sChars[leftindex-j]=='R') {
							sChars[i]='R';
							sChars[leftindex-j]='W';
							leftindex=leftindex-j-1;
							cnt++;
							break;
						}
					}
				}
			}
			System.out.println(cnt);
	}	
}