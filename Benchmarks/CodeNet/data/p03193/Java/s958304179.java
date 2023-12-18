import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int h = in.nextInt();
		int w = in.nextInt();
		int counter = 0;
		for(int i =0;i<n;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if(a>=h&&b>=w) {
				counter++;
			}			
		}
		System.out.println(counter);
	}
}
