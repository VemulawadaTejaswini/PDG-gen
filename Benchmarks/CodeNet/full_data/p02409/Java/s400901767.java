import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	int[][][] inf = new int[4][3][10];
	int n = in.nextInt();
	for (int i = 0; i < n; i++) {
	    int b = in.nextInt();
	    int f = in.nextInt();
	    int r = in.nextInt();
	    int v = in.nextInt();
	    inf[b - 1][f - 1][r - 1] += v;
	}
	for (int build = 0; build < 4; build++) {
	    for (int floor = 0; floor < 3; floor++) {
		sb.setLength(0);
		for (int room = 0; room < 10; room++) {
		    sb.append(" ");
		    sb.append(inf[build][floor][room]);
		}
		System.out.println(sb);
	    }
	    if (build != 3) {
		System.out.println("####################");
	    }
	}
    }
}
