import java.util.Scanner;

class Main {
    public static long kanacy(long b, long[] a) {
        long sum=0;
        for(int i=0; i<a.length; i++) {
            sum += Math.abs(a[i] - (b+i+1));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long max = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            max = a[i]>max ? a[i] : max;
        }
        sc.close();

        long kmin = 100000000; 
        for(long b=-max; b<max; b++) {
            long t = kanacy(b, a);
            if(t<kmin) kmin = t;
        }
        System.out.println(kmin);
    }
}