import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		long n = Long.parseLong(sc.next());
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		int count = 0;
		long index = 0;
		for(int i=0; i<n; i++) {
			// 一巡したら戻す
			if(index == a+b) {
				index = 0;
			}
			if(index < a) {
				count++;
			}
			index++;
		}
		System.out.println(count);
	}
}