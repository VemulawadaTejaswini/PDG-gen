import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int k1 = sc.nextInt();
		int k2 = sc.nextInt();
		int score[] = new int[4];
		score[0] = sc.nextInt();
		score[1] = sc.nextInt();
		score[2] = sc.nextInt();
		score[3] = sc.nextInt();
		int hP = h1 * score[0] + h1 / 10 * score[2] + h2 * score[1] + h2 / 20 * score[3];
		int kP = k1 * score[0] + k1 / 10 * score[2] + k2 * score[1] + k2 / 20 * score[3];
		if(hP == kP) {
			System.out.println("even");
		}else {
			System.out.println(hP > kP ? "hiroshi" : "kenjiro");
		}
	}
}