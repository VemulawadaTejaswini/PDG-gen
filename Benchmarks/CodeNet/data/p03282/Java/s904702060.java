import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String K = sc.next();
		sc.close();

		char ans;
		
		if(K.equals("1")){
			ans = S.charAt(0);
		}else{
			if(S.charAt(0) == '1'){
				ans = S.charAt(1);
			}else{
				ans = S.charAt(0);
			}
		}
		System.out.println(ans);
	}
}