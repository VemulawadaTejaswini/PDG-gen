import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[][] tree = new int[N-1][2];

        for (int i = 0; i < N-1; i ++) {
        	tree[i][0] = sc.nextInt();
        	tree[i][1] = sc.nextInt();
        }

        long[] comp = new long [N];
        for (int i = 0; i < N; i++ ) {
            comp[i] = 0;
        }

        for (int i = 0; i < Q; i++) {
        	comp[sc.nextInt()-1] +=  sc.nextLong();
        }

        sc.close();

        for (int i = 0; i < N-1; i++) {
        	comp[tree[i][1]-1] += comp[tree[i][0]-1];
        }
        for (int i = 0; i < N; i++) {


    	  System.out.print(comp[i] + " ");
        }

    }
}