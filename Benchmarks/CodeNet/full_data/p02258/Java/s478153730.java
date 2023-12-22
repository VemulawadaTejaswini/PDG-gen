import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextLong();
        sc.close();
        System.out.println(max(a));
    }

    private static long max(long[] a){
        long max = Long.MIN_VALUE;
        for(int i = 0,l = a.length;i < l;i++){
            for(int j = i + 1;j < l;j++){
                long s = a[j] - a[i];
                if(max < s) max = s;
            }
        }
        return max;
    }

}