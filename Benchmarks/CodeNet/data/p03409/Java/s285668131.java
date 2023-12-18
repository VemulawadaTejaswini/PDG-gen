import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		Dxy[] ab = new Dxy[n];
		Dxy[] cd = new Dxy[n];
		for (int i = 0; i < n; i++) {
			ab[i] = new Dxy(in.nextInt(), in.nextInt());
		}
		for (int i = 0; i < n; i++) {
			cd[i] = new Dxy(in.nextInt(), in.nextInt());
		}
		System.out.println(solve(ab, cd));
		in.close();
	}

	private static int solve(Dxy[] ab, Dxy[] cd) {
		int r = 0;
		Arrays.sort(cd, new CompCD());
		Arrays.sort(ab, new CompAB());
		boolean[] fab = new boolean[ab.length];
		for (int i = 0; i < cd.length; i++)
			for (int j = 0; j < ab.length; j++)
				if (ab[j].x < cd[i].x && ab[j].y < cd[i].y && !fab[j]) {
					r++;
					fab[j] = true;
					break;
				}
		return r;
	}
}

class CompAB implements Comparator<Dxy> {
	public int compare(Dxy a, Dxy b) {
		if (a.y == b.y)
			return b.x - a.x;
		else
			return b.y - a.y;
	}
}

class CompCD implements Comparator<Dxy> {
	public int compare(Dxy a, Dxy b) {
		if (a.x == b.x)
			return a.y - b.y;
		else
			return a.x - b.x;
	}
}

class Dxy {
	public Dxy(int a, int b) {
		x = a;
		y = b;
	}

	int x;
	int y;
}
