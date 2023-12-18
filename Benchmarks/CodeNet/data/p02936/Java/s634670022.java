import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
class MyScanner {
    BufferedReader br;

    MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int intLine() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public String line() throws IOException {
        return br.readLine();
    }

    public int[] intArray() throws IOException {
        String[] in = br.readLine().split(" ");
        int n = in.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            res[i] = Integer.parseInt(in[i]);
        }
        return res;
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        // 各頂点についてその子を列挙したList
        List<List<Integer>> childlen = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            childlen.add(new ArrayList<>());
        }

        // 子の情報をScanしてListに記録する
        for(int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            childlen.get(a - 1).add(b - 1); // 0オリジンに直す
        }

        // 一旦各頂点だけカウンターを増やす
        int[] counter = new int[n];
        for(int i = 0; i < q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            counter[p - 1] += x;
        }

        // 各頂点のカウントを子にも増やす(根から)
        Stack<Integer> stack = new Stack<>(); 
        // Stackから要素を取り出して処理を行い、
        // その子をStackに入れることで次は子を処理、一番下まで行ったら次の子を処理
        stack.push(0); // 根は0
        while(!stack.isEmpty()) {
            int par = stack.pop();
            List<Integer> c = childlen.get(par); //parの子List
            for(int child : c) {
                counter[child] += counter[par];
                stack.push(child);
            }
        }

        // 出力
        for(int i = 0; i < n; i++) {
            if(i != 0) System.out.print(" ");
            System.out.print(counter[i]);
        }
        System.out.println();
    }
}
