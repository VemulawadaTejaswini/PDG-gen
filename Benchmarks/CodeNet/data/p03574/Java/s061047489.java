
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int H = Integer.parseInt(scan.next());
		int W = Integer.parseInt(scan.next());
		String[] S = new String[H];
		for(int i = 0; i < H; i++) {
			S[i] = scan.next();
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				search(H, W, i, j, S);
			}
			System.out.println();
		}
		scan.close();

	}
	
	public static void search(int H, int W, int i, int j, String[] S) {
		int sum = 0;
		boolean R = true;
		boolean L = true;
		boolean U = true;
		boolean D = true;
		boolean RU = true;
		boolean RD = true;
		boolean LU = true;
		boolean LD = true;
		
		if(i == 0) {
			U = false;
			RU = false;
			LU = false;
		}
		if(i == H - 1) {
			D = false;
			RD = false;
			LD = false;
		}
		if(j == 0) {
			L = false;
			LU = false;
			LD = false;
		}
		if(j == W - 1) {
			R = false;
			RU = false;
			RD = false;
		}
		
		if(R) {
			if(S[i].substring(j + 1, j + 1 + 1).equals("#")) {
				sum++;
			}
		}
		if(L) {
			if(S[i].substring(j - 1, j - 1 + 1).equals("#")) {
				sum++;
			}
		}
		if(U) {
			if(S[i - 1].substring(j, j + 1).equals("#")) {
				sum++;
			}
		}
		if(D) {
			if(S[i + 1].substring(j, j + 1).equals("#")) {
				sum++;
			}
		}
		if(RU) {
			if(S[i - 1].substring(j + 1, j + 1 + 1).equals("#")) {
				sum++;
			}
		}
		if(RD) {
			if(S[i + 1].substring(j + 1, j + 1 + 1).equals("#")) {
				sum++;
			}
		}
		if(LU) {
			if(S[i - 1].substring(j - 1, j - 1 + 1).equals("#")) {
				sum++;
			}
		}
		if(LD) {
			if(S[i + 1].substring(j - 1, j - 1 + 1).equals("#")) {
				sum++;
			}
		}
		if(S[i].substring(j, j + 1).equals("#")) {
			System.out.print("#");
		} else {
			System.out.print(sum);
		}
	}

}
