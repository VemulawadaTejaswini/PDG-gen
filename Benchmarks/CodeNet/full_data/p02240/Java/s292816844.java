import java.util.Scanner;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pid) id[i] = qid;
        }
    }
}


public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        QuickFindUF uf = new QuickFindUF(N);

        // input
        for (int i = 0; i < M; i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            uf.union(p, q);
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if (uf.connected(p,q))
                System.out.print("yes\n");
            else
                System.out.print("no\n");
        }
    }
}