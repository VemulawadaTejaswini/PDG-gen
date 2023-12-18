import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int count = 0;
		int index = 0;
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