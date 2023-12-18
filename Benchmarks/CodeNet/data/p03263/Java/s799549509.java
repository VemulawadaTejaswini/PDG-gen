import java.util.ArrayList;
import java.util.Scanner;

class Ope{
	int h1, w1, h2, w2;
	public Ope(int H1, int W1, int H2, int W2) {
		h1 = H1; w1 = W1; h2 = H2; w2 = W2;
	}
}
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		int[][] a = new int[H][W];
		for(int i = 0; i < H; i++) for(int j = 0; j < W; j++) a[i][j] = sc.nextInt();
		ArrayList<Ope> operation = new ArrayList<Ope>();
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(a[i][j] % 2 == 0) continue;
				if(j + 1 < W) {
					a[i][j]--;
					a[i][j + 1]++;
					operation.add(new Ope(i + 1, j + 1, i + 1, j + 2));
				}else if(i + 1 < H){
					a[i][j]--;
					a[i + 1][j]++;
					operation.add(new Ope(i + 1, j + 1, i + 2, j + 1));
				}
			}
		}
		System.out.println(operation.size());
		for(Ope op : operation) {
			System.out.println(op.h1+" "+op.w1+" "+op.h2+" "+op.w2);
		}
	}
}