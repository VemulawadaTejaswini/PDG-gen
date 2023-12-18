import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String get,ans;
		get = sc.nextLine();
		sc.close();
		ans = get.substring(0, 4)+" "+get.substring(4,12);
		System.out.println(ans);
	}

}