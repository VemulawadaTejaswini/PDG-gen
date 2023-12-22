import java.util.Scanner;

public class Main {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int R = sc.nextInt();
		int time = 0;
		if(H + R < 0)    time = -1;
		else if(H + R >= 2*R) time =  1;
		else if(H + R == 0)   time = 0;
		else if(H + R >= 1) time = 1;
		System.out.println(time);
	}
}
