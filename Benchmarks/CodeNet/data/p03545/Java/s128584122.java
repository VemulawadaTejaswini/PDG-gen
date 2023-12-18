import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] num = new int[4];
		for (int i = 0; i < 4; i++) {
			num[i] = Integer.parseInt(S.substring(i, i + 1));
		}
		for (int i=-1; i<=1; i+=2) {
			for (int j = -1; j <= 1; j+=2) {
				for (int k = -1; k <= 1; k+=2) {
					if (num[0] + i*num[1] + j*num[2] + k*num[3] == 7) {
						System.out.println(String.format("%d%+d%+d%+d=7", num[0], i*num[1], j*num[2], k*num[3]));
						return;
					}
				}
			}
		}
	}
}