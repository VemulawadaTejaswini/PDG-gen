import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Sn = 0;
		String NS = String.valueOf(N);
		for(int i = 0;i < NS.length(); i++) {
			Sn += Integer.parseInt(String.valueOf(NS.charAt(i)));
		}
		if(N % Sn == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}