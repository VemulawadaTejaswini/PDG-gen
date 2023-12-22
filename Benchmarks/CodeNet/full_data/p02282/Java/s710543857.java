import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static int[] preorder;
    static int[] inorder;
    static int[] postorder;
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        preorder = new int[n];
        inorder = new int[n];
        postorder = new int[n];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n; i++)
            preorder[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n; i++)
            inorder[i] = Integer.parseInt(st.nextToken());
        rec(0, 0, 0, n);
        final StringBuilder sb = new StringBuilder();
        sb.append(postorder[0]);
        for(int i = 1; i<n; i++){
            sb.append(' ').append(postorder[i]);
        }
        System.out.println(sb);
    }
    static void rec(int pre, int in, int post, int n){
        if(n<=0) return;
        final int p = preorder[pre];
        postorder[post+n-1] = p;
        int i;
        for(i = in; inorder[i]!=p; i++);
        final int rlen = n-(i-in)-1;
        rec(pre+1, in, post, i-in);
        rec(pre+1+i-in, i+1, post+i-in, rlen);
    }

}