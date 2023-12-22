
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static class Root {
        int root;
        int size;
        Root (int root) {
            this.root = root;
            this.size = 1;
        }
    }

    static Root find(int i) {
        if(roots[i].root == i) {
            return roots[i];
        }
        roots[i].root = roots[roots[i].root].root;
        return find(roots[i].root);
    }

    static void union(Root a, Root b) {
        if(a.root == b.root) return;
        if(a.size < b.size){
            a.root = b.root;
            b.size += a.size;
        } else {
            b.root = a.root;
            a.size += b.size;
        }
    }

    static Root[] roots;

    static void solve(InputStream is, PrintStream os) {
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        roots = new Root[N];
        for (int i = 0; i < N; i++) {
            roots[i] = new Root(i);
        }
        for (int i = 0; i < M; i++) {
            int A = scan.nextInt()-1;
            int B = scan.nextInt()-1;
            Root ra = find(A);
            Root rb = find(B);
            union(ra, rb);
        }

        int maxNumOfGroup = 0;
        for (int i = 0; i < N; i++) {
            Root root = find(i);
            maxNumOfGroup = Math.max(maxNumOfGroup, root.size);
        }
        os.println(maxNumOfGroup);
    }
}
