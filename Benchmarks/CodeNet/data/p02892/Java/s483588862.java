import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        ArrayList<Tree> trees = new ArrayList<>(N);
        for (int i = 0; i < N; i++){
            Tree tree = new Tree();
            tree.num = i;
            trees.add(tree);
        }

        for(int i = 0; i < Math.ceil(N/2.0); i++) {
            String S = scan.next();
            char sChar[] = S.toCharArray();
            for (int j = 0; j < sChar.length; j++) {
                if(sChar[j] == '1') {
                    if(!trees.get(i).getChild().contains(trees.get(j)))
                    trees.get(i).addChild(trees.get(j));
                    if(!trees.get(j).getChild().contains(trees.get(i)))
                        trees.get(j).addChild(trees.get(i));
                }
            }
        }

        Tree startTree = trees.get(0);
        int min = 1000;//N <= 200
        for (Tree tree : trees) {
            if(tree.getChild().size() < min) {
                min = tree.getChild().size();
                startTree = tree;
            }
        }

        ArrayList<Tree> firstGp = new ArrayList<>();
        ArrayList<Tree> secondGp = new ArrayList<>();
        firstGp.add(startTree);
        int count = 0;
        while(!firstGp.isEmpty()) {
            count++;
            for (Tree tree : firstGp) {
                for (Tree child : tree.getChild()) {
                    if(tree.equals(child))
                        continue;
                    if (firstGp.contains(child)) {
                        os.println(-1);
                        return;
                    }
                    if (!secondGp.contains(child))
                        secondGp.add(child);
                }
            }
            for (Tree deleteTree : firstGp) {
                for (Tree tree : trees) {
                    tree.getChild().remove(deleteTree);
                }
                trees.remove(deleteTree);
            }
            firstGp.clear();
            firstGp.addAll(secondGp);
            secondGp.clear();
        }

        os.println(count);

    }

    private static class Tree {
        ArrayList<Tree> child = new ArrayList<>();
        int num = 0;

        public void addChild(Tree tree) {
            child.add(tree);
        }

        public ArrayList<Tree> getChild() {
            return child;
        }
    }
}