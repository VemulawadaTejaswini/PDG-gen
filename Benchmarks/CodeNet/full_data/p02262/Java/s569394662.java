import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Stack<Integer> g = new Stack<>();
        int gi = 1;
        if(n == 1) g.push(1);
        while(gi < n) {
            g.push(gi);
            gi = gi * 3 + 1;
        }
        System.out.println(g.size());
    
        cnt = 0;
        StringBuilder sb = new StringBuilder();
        while(true) {
            gi = g.pop();
            sb.append(gi);
            insertionSort(a, n, gi);
            if(g.isEmpty()) break;
            sb.append(" ");
        }
        System.out.println(sb);
        System.out.println(cnt);

        for(int ai : a) {
            System.out.println(ai);
        }

        sc.close();
    }

    private static void insertionSort(int[] a, int n, int gi) {
        for(int i = gi; i < n; i++) {
            int v = a[i];
            int j = i - gi;
            while(j >= 0 && a[j] > v) {
                a[j + gi] = a[j];
                j -= gi;
                cnt++;
            }
            a[j + gi] = v;
        }
    }
}
