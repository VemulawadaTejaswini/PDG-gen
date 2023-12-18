import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static ArrayList<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int[] Q = new int[N];
        for(int i=0;i<N;i++){
            P[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            Q[i]=sc.nextInt();
        }
        permutation(P);
        list.sort(Comparator.naturalOrder());
        System.out.println(Math.abs(list.indexOf(Arrays.toString(P))-list.indexOf(Arrays.toString(Q))));
    }

    private static void permutation(int[] seed) {
		int[] perm = new int[seed.length];
		boolean[] used = new boolean[seed.length];
		buildPerm(seed, perm, used, 0);
	}

	private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
		if (index == seed.length) {
			procPerm(perm);
			return;
		}
		for (int i = 0; i < seed.length; ++i) {
			if (used[i])
				continue;
			perm[index] = seed[i];
			used[i] = true;
			buildPerm(seed, perm, used, index + 1);
			used[i] = false;
		}
	}

	private static void procPerm(int[] perm) {
		list.add(Arrays.toString(perm));
	}
}
