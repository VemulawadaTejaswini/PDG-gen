import java.util.Scanner;
public class AOJ0101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();sc.nextLine();
		while(t--!=0)System.out.println(sc.nextLine().replace("Hoshino", "Hoshina"));
	}
}