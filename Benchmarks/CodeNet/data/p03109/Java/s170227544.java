import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = Integer.valueOf(sc.next().replace("/", ""));
		System.out.println((s <= 20190430) ? "Heisei" : "TBD");	
	}
}