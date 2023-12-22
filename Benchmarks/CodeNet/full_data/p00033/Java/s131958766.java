import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ball = new int[10];
		for (int i = 0;  i < n; i++){
			for(int j = 0; j < ball.length; j++){
				ball[j] = sc.nextInt();
			}
			boolean judge = true;
			int rb = 0, rc = 0;
			rb = ball[0];
			for(int j = 1; j < ball.length; j++){
				if(rb < ball[j]) rb = ball[j];
				else if(rc < ball[j]) rc = ball[j];
				else judge = false;
			}
			if(judge) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}