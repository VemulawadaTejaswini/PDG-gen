import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Integer> solve(int[] pre, int[] in, int preroot, int infirst, int inlast) {
        List<Integer> res = new ArrayList<>();

        int root = infirst;
        for(int i = infirst; i < inlast; i++) {
            if(pre[preroot] == in[i]) {
                root = i;
                break;
            }
        }

        if(infirst < root) res.addAll(solve(pre, in, preroot + 1, infirst, root));
        if(root < inlast - 1) res.addAll(solve(pre, in, preroot + (root - infirst + 1), root + 1, inlast));

        res.add(in[root]);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] pre = new int[n];
        for(int i = 0; i < n; i++) {
            pre[i] = sc.nextInt();
        }
        int[] in = new int[n];
        for(int i = 0; i < n; i++) {
            in[i] = sc.nextInt();
        }

        List<Integer> ans = solve(pre, in, 0, 0, n);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(i != 0) sb.append(" ");
            sb.append(ans.get(i));
        }
        System.out.println(sb);

        sc.close();
    }
}

