import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] union = new int[n];
        for (int i = 0; i < n; i++) {
            union[i] = i;
        }

        for (int i = 0; i < m; i++) {
            union(union, scanner.nextInt() - 1, scanner.nextInt() - 1);
        }

        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            sum[find(union, i)]++;
        }
        Arrays.sort(sum);

        System.out.println(sum[n - 1]);
    }

    //return root node idx O(a(N)) ( O(1)<O(a(N))<O(logN) )
    public static int find(int[] tree,int idx) {
        if(tree[idx]==idx) return idx;
        else return tree[idx] = find(tree,tree[idx]);
    }

    //union idx2 tree to idx1 tree O(a(N))
    public static void union(int[] tree,int idx1,int idx2) {
        int root1 = find(tree,idx1);
        int root2 = find(tree,idx2);
        tree[root2] = root1;
    }

}