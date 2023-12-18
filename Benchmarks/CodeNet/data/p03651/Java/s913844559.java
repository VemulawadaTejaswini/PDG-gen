import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static final int MAX_A = 1000000000;
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        boolean[] flag = new boolean[MAX_A+1];
        LinkedList<Integer> array = new LinkedList();
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num == k || num == 1) {
                System.out.println("POSSIBLE");
                return;
                
            }
            if(!flag[num]) {
                flag[num] = true;
                array.add(num);
            }
//            a[i] = scan.nextInt();
//            if (a[i] == k || a[i] == 1) {
//                System.out.println("POSSIBLE");
//                return;
//            }
        }
        int length = array.size();
        int max = 0;
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = array.get(i);
            max = Math.max(max, a[i]);
        }
        int g = calcGcd(a);
//        System.out.println(g);
        if (k%g == 0 && max >= k)
            System.out.println("POSSIBLE");
        else
            System.out.println("IMPOSSIBLE");
    }
    
    int calcGcd(int... params) {
        int length = params.length;
//        System.out.println("len" + length);
        int g = gcd(params[0], params[1]);
        for (int i = 0; i < length - 1; i++) {
            g = gcd(g, params[i + 1]);
            if (g == 1)
                return g;
        }
        return g;
    }
    
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
