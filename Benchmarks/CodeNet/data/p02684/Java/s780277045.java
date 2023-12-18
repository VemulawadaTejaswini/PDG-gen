import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt()-1;
        }
        int nex = a[0];
        int size = 1;
        for (int i = 0; i < n; i++) {
            if(nex == 0) break;
            size++;
            nex = a[nex];
        }
        long rest = k % size;
        int ans = 0;
        for (int i = 0; i < rest; i++) {
            ans = a[ans];
        }
        System.out.println(ans+1);
        sc.close();

    }

}
