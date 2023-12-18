import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long k = stdIn.nextLong();
        int[] a = new int[n];
        for(int i = 0;i<n;i++) {
            a[i] = stdIn.nextInt();
        }
        long count = 0;
        int[] b = new int[n];
        for(int i = 0;i<a.length;i++) {
            for(int j = i+1;j<a.length;j++) {
                if(a[i] > a[j]) {
                    b[i]++;
                }
            }
        }

        for(int i = 0;i<a.length;i++) {
            count += sum(b[i],k) % (1000000000+7);
            count = count % (1000000000+7);
            System.out.println(count);
        }
        System.out.println((count)%(1000000000+7));
    }

public static long sum(int a,long k) {
    long goukei = 0;
    goukei = a * (k/2*(k+1));
    return goukei;
    }
}