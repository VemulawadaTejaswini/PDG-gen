import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        Tree tree[] = new Tree[N + 1];
        for(int i = 0; i < N + 1; i++) {
            tree[i] = new Tree();
            tree[i].value = 0;
        }

        for(int i = 0; i < N-1; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            tree[b].tree.add(tree[a]);
        }

        for(int i = 0; i < Q; i++) {
            int p = scan.nextInt();
            int x = scan.nextInt();
            tree[p].value += x;
        }

//        tree[1].addValueToChildren(tree[1].value);

        for(int i = 0; i < N; i++) {
            if (!tree[i+1].tree.isEmpty())
                tree[i+1].value += tree[i+1].tree.get(0).value;
            os.print(tree[i+1].value);
            if(i+1 < N)
                os.print(" ");
            else
                os.println();
        }
    }
}

class Tree {
    int value = 0;
    List<Tree> tree = new ArrayList<>();

    public Tree(){}

    public void addValueToChildren(int x){
        for(Tree child : tree) {
            child.value += x;
            child.addValueToChildren(child.value);
        }
    }
}