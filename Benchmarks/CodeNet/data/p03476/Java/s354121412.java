import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute22_1();
	}

	private static void execute22_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int Q = sc.nextInt();
			int[][] q = new int[Q][2];

			for (int i = 0; i < Q; i++) {
				q[i][0] = sc.nextInt();
				q[i][1] = sc.nextInt();
			}

			boolean[] isSo = new boolean[100005];

			for (int i = 0; i < isSo.length; i++)
				isSo[i] = true;

			isSo[0] = false;
			isSo[1] = false;
			for (int i = 2; i*i < isSo.length; i++) {
				if(isSo[i]) for(int j = 2;i*j<isSo.length;j++) isSo[i*j] = false;
			}
			for (int i = 0; i < Q; i++) {
				int ans=0;
				for(int x=q[i][0];x<=q[i][1];x++) {
					if(isSo[x]&&isSo[(x+1)/2]) ans++;
				}
				
				System.out.println(ans);
			}

		}
	}
}