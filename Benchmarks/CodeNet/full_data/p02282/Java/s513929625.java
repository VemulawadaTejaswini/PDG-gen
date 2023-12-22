import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static int n, pos;
    static int[] pre, in;
    static List<Integer> post;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        pre = new int[n];
        in = new int[n];
        post = new ArrayList<>();
        for(int i = 0; i < n; i++){
            pre[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < n; i++){
            in[i] = Integer.parseInt(sc.next());
        }
        pos = 0;
        reconstruction(0, n);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(post.get(i)).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
    
    static void reconstruction(int l, int r){
        
        if(l >= r) return;
        int root = pre[pos++];
        int m = 0;
        for(int i = 0; i < n; i++){
            if(in[i] == root){
                m = i;
                break;
            }
        }
        reconstruction(l, m);
        reconstruction(m+1, r);
        post.add(root);
    }
}
