
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		int can = 0;
		for(int i = 0; i < n; i++)
			if(in.nextInt() >= k)
				can++;
		System.out.println(can);
	}
}