import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxheight = 0;
		int n = sc.nextInt();
		int currenth = 0, canwatch = 0;
		for(int i = 0;i < n;i ++) {
			currenth = sc.nextInt();
			if(maxheight <= currenth) {
				canwatch++;
				maxheight = currenth;
			}
		}
		System.out.println(canwatch);
	}
}