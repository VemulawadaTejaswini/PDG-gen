import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str = scan.next();
		char alp[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			alp[i] = str.charAt(i);
			if(alp[i] + n >= 91) {
				alp[i] += n-26;
			}else {
				alp[i] += n;
			}
			System.out.print(alp[i]);
		}
		
		
		

	}

}
