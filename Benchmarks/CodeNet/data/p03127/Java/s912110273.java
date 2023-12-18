import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for (int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }

        Arrays.sort(a);
        long min = find(a[0],a[1]);
        for (int i=2;i<n;i++){
            min = find(a[i],min);
        }

        System.out.println(min);
    }

    static long find(long a, long b){
        if (a==b){
            return a;
        }

        while (b > 0){
            long remain = (long) a%b;
            a = b;
            b = remain;
        }
        return a;
    }
}