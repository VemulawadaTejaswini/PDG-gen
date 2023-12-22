import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();
		
		if(((1<=D)&&(D<=10000))||((1<=T)&&(T<=10000))||((1<=S)&&(S<=10000))) {
		int t = D/S;
		if(t<=T) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		}
		sc.close();
	}

}