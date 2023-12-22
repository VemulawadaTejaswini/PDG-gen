import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int x =0;
		
		for(int i=0;i<S.length();i++) {
			if(T.charAt(i)!=S.charAt(i)) {
				x ++;
			}
		}
		System.out.println(x);
		sc.close();

	}

}