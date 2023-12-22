import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		HashSet<String>map = new HashSet<String>();

		for (int i=0; i<n; i++){
			map.add(sc.next());
		}
		System.out.println(map.size());
	}
}