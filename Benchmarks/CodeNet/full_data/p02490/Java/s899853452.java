import java.util.Scanner;

class Main {
	public static void main {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext) {
		int i = sc.nextInt();
		int k = sc.nextInt();
		if (i == k) {
			break;
		} else if (i < k) {
			System.out.println(i+" "+k);
		} else {
			System.out.println(k+" "+i);
		}	
	}
}