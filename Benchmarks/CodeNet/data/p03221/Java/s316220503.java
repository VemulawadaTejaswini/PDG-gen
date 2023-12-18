import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] P = new int[M];
	int[] Y = new int[M];
	int[] countN = new int[N+1];
	int[] Ynum = new int[M];
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

	for(int i = 0; i<M; i++) {
	    P[i] = sc.nextInt();
	    Y[i] = sc.nextInt();
	    queue.add(Y[i]);
	}
	for(int i = 0; i<M; i++) {
	    int index = 0;
	    int min = queue.poll();
	    for(int j = 0; j<M; j++) {
		if(Y[j] == min) {
		    countN[P[j]]++;
		    Ynum[j] = countN[P[j]];
		    break;
		}
	    }
	}

	for(int i = 0; i<M; i++) {
	    String ans = String.format("%06d", P[i]) + String.format("%06d", Ynum[i]);
	    System.out.println(ans);
	}

    }
}