import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int n = s.length();
		String answer ="";
		for(int i=0;i<n; i++) {
			if(i%2==0 && (c[i]=='R'||c[i]=='U'||c[i]=='D')) {
			   answer="Yes";
			}else if(i%2!=0 && (c[i]=='L'||c[i]=='U'||c[i]=='D')) {
				answer="Yes";
			}else {
				answer="No";
				break;
			}
		}
		System.out.println(answer);
	}

}
