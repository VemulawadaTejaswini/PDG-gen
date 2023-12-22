import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S.substring(S.length()-1)=="e") {
			System.out.println(S+"s");
		}else if(S.substring(S.length()-1)=="s") {
			System.out.println(S+"es");
		}else {
			System.out.println(S+"s");
		}
		sc.close();

	}

}
