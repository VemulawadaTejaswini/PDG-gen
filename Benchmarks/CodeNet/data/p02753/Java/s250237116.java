import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		long n = Integer.parseInt(sc.next());
		long a = Integer.parseInt(sc.next());
		long b = Integer.parseInt(sc.next());
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