
import java.util.Scanner;

public class Main {
	static int[][][] house = new int[4][3][10];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int b = sc.nextInt() - 1;
			int f = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			house[b][f][r] += sc.nextInt();
		}
		String s = "";
		for(int i = 0; i < 4; i++) {
			if(i != 0) {
				s += "\n####################\n";
			}
			for(int k = 0; k < 3; k++) {
				if(k != 0){
					s += "\n";
				}
				for(int l = 0; l < 10; l++) {
					s += " " + house[i][k][l];
				}
			}
		}
		System.out.println(s);
	}
}

