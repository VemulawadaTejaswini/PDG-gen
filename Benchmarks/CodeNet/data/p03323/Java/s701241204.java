import java.util.*;

public class Main {
	public static void main(String[] orgs) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		if(A + B <= 16){
			System.println("Yay!");
		}else {
			System.println(":(");
		}
	}
}