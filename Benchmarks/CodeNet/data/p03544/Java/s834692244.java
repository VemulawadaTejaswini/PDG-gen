import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] lucasnum = new int[86];
		lucasnum[0] = 2;
		lucasnum[1] = 1;
		for(int i = 2; i < 86; i++) {
			lucasnum[i] = lucasnum[i-1] + lucasnum[i-2];
		}
		System.out.println(lucasnum[n]);
	}

}
