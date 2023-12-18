import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		String S = sc.next();

		for (int i=0; i<S.length(); i++){
			if (i == a){
				if (S.charAt(i) != '-'){
					System.out.println("No");
					return;
				}
			}else {
				if (!Character.isDigit(S.charAt(i))){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
		return;
    }
}
