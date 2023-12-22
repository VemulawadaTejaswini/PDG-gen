

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int N;
    static int S;
    static int[] A;
    static long[] t = new long[30];
    static long res  = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        init30();
        read();
    }

    public static void init30(){
        t[0] =1;
        for(int i = 1;i<=29;i++){
            t[i] = 1<<i;
        }
    }

    static class TreeNode {
        List<TreeNode> subNodes = new ArrayList<>();
        int add =  0;

        public TreeNode(){

        }

        public TreeNode(int add){
            this.add = add;
        }

        public static TreeNode union(TreeNode Q,TreeNode P){
            TreeNode root = new TreeNode();
            if( Q != null) {
                root.subNodes.add(Q);
            }
            if( P != null){
                root.subNodes.add(P);
            }
            return root;
        }

        public static TreeNode unionEle(TreeNode Q){
                TreeNode res = new TreeNode();
                res.subNodes = Q.subNodes;
                res.add = Q.add + 1;
                return res;
        }

        @Override
        public String toString() {
          return "{subNodes="+subNodes.toString()+",add="+this.add+"}";
        }
    }

    private static void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split(" ");
        N = Integer.parseInt(word[0]);
        S = Integer.parseInt(word[1]);
        word = br.readLine().split(" ");
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.valueOf(word[i]);
        }
        TreeNode[][] F = new TreeNode[N][S + 1];

        for (int s = 0; s <= S; s++) {
            F[0][s] = null;
        }
        F[0][0] = new TreeNode();
        TreeNode node = new TreeNode(1);

        if (A[0] <= S)
            F[0][A[0]] = node;

        for (int i = 1; i < N; i++) {
            F[i][0] = new TreeNode();
            for (int j = 1; j <= S; j++) {
                if ( j>=A[i] &&  F[i-1][j-A[i]] != null) {
                    TreeNode Q = TreeNode.unionEle(F[i-1][j - A[i]]);
                    F[i][j] = TreeNode.union(F[i-1][j], Q);
                }
                else if ( F[i-1][j] != null) {
                    F[i][j] = F[i-1][j];
                }
            }
        }

        if( F[N-1][S] == null){
            System.out.println(0);
            br.close();
            return;
        }
//        System.out.println(F[N-1][S]);
        node = F[N-1][S];
        dfs(node,0);
        System.out.println(res);
        br.close();
    }

    public static void dfs(TreeNode node,int pathNum){
        if( node == null){
            return;
        }
        pathNum = pathNum + node.add;
        if ( node.subNodes.isEmpty() ) {
            int leftsize = N - pathNum;
            res = ( res + mypower(2,leftsize)) %998244353;
            return;
        }
        for(TreeNode subnode:node.subNodes){
            dfs(subnode,pathNum);
        }
    }

    public static long mypower(int base, int power) {
        int i = 0;
        long res = 1;
        while (i < power) {
            i = i + 29;

            if (i > power) {
                res = res*t[power-(i-29)]%998244353;
            } else {
                res = (res *t[29]) % 998244353;
            }

        }

        return res;
    }
}
