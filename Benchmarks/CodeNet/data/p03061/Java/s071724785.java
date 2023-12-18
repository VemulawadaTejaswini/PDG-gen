import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        if(n==2) {
            System.out.println(Math.max(a[0], a[1]));
            return;
        }

        // n > 2
        int[] minGCDs = new int[n];
        int[] secondMinGCDs = new int[n];
        for(int i=0; i<n; i++) {
            int minGCD = Integer.MAX_VALUE;
            int secondMinGCD = Integer.MAX_VALUE;
            for(int j=0; j<n; j++) {
                if(j==i) {
                    continue;
                }
                int gcd = gcd(a[i], a[j]);
                if(gcd < minGCD) {
                    secondMinGCD = minGCD;
                    minGCD = gcd;
                }
                else if(gcd < secondMinGCD) {
                    secondMinGCD = gcd;
                }
            }
            minGCDs[i] = minGCD;
            secondMinGCDs[i] = secondMinGCD;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(secondMinGCDs[i] < min) {
                secondMin = min;
                min = secondMinGCDs[i];
            }
            else if(secondMinGCDs[i] < secondMin) {
                secondMin = secondMinGCDs[i];
            }
        }

        System.out.println(secondMin);
    }
    private static int gcd(int a, int b) {
        if(a==b) {
            return a;
        }
        if(b>a) {
            // swap
            int s = a;
            a = b;
            b = s;
        }
        while(true) {
            int mod = a % b;
            if(mod==0) {
                return b;
            }
            a = b;
            b = mod;
        }
    }
}
