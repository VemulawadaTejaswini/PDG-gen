import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int [200001];
        for (int i = 0; i < n; i++) a[sc.nextInt()] +=1;

        PriorityQueue<Integer> q = new PriorityQueue<>(200000);
        for (int val: a)
            if (val > 0) q.add(val);
        int ans = 0;
        while (q.size() > k) ans += q.poll();
        System.out.println(ans);
    }
}
