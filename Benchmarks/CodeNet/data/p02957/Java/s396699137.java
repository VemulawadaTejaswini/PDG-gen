import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int A = Integer.parseInt(spl[0]);
		int B = Integer.parseInt(spl[1]);
		sc.close();

		if(A == B) {
			System.out.println(0);
		}else if((A + B) % 2 == 0){
			System.out.println((A + B) / 2);
		}else {
			System.out.println("IMPOSSIBLE");
		}
	}
}