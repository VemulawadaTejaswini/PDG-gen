import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static final int MAX_A = 1000000000;
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        boolean[] flag = new boolean[MAX_A+1];
        LinkedList<Integer> a = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if(!flag[num]) {
                a.add(num);
                flag[num] = true;
            }
//            a[i] = scan.nextInt();
//            if (a[i] == k) {
//                System.out.println("POSSIBLE");
//                return;
//            }
        }
        int max = 0;
        for (Integer num : a)
            max = Math.max(max, num);
        int g = calcGcd((Integer[])a.toArray(new Integer[0]));
//        System.out.println(g);
        if (k%g == 0 && max >= k)
            System.out.println("POSSIBLE");
        else
            System.out.println("IMPOSSIBLE");
    }
    
    int calcGcd(Integer... integer) {
        int length = integer.length;
//        System.out.println("len" + length);
        int g = gcd(integer[0], integer[1]);
        for (int i = 0; i < length - 1; i++) {
            g = gcd(g, integer[i + 1]);
            if (g == 1) {
                return g;
            }
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
