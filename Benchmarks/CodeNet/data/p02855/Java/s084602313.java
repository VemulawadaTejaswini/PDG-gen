import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int H = stdIn.nextInt();
		int W = stdIn.nextInt();
		int K = stdIn.nextInt();
		String[][] s = new String[H][W];
		int[][] a = new int[H][W];
		for(int i = 0; i < H; i++) {
			char[] words = stdIn.next().toCharArray();
			for(int j = 0; j < W; j++) {
				s[i][j] = String.valueOf(words[j]);
			}
		}
		
		int p = 1;
		for(int i = 0; i < H; i++) {
			boolean flag = false;
			for(int k = 0; k < W; k++) {
				if(s[i][k].equals("#")) {
					flag = true;
					break;
				}
			}
			if(flag) {
				int j = 0;
				while(j < W && s[i][j].equals(".")) {
					a[i][j] = p;
					j++;
				}
				a[i][j] = p;
				j++;
				while(j < W && s[i][j].equals(".")) {
					a[i][j] = p;
					j++;
				}
				for(; j < W; j++) {
					if(s[i][j].equals(".")) a[i][j] = p;
					else {
						p++;
						a[i][j] = p;
					}
				}
				p++;
			}
			else {
				if(i == 0) {
					Arrays.fill(s[i],0);
				}
				for(int j = 0; j < W; j++) {
					a[i][j] = a[i-1][j];
				}
			}
		}
		
		if(a[0][0] == 0) {
			int temp = 0;
			for(int i = 0; i < H; i++) {
				if(a[i][0] != 0) {
					temp = i;
					break;
				}
			}
			for(int i = 0; i < temp; i++) {
				for(int j = 0; j < W; j++) {
					a[i][j] = a[temp][j];
				}
			}
		}
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}