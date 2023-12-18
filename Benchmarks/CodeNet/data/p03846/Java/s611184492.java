import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] times = new int[n];
    
        boolean isOdd = (n % 2 == 1);
        int num = 0;
        for(int i = 0; i < n; i++) {
            num = sc.nextInt();

            if(isOdd && (num % 2 == 1)) {
                System.out.println(0);
                return;
            } 
            if(!isOdd && (num % 2 == 0)) {
                System.out.println(0);
                return;
            }
            
            times[num]++;
            if(times[num] > 2) {
                System.out.println(0);
                return;
            }
        }

        for(int i = 1; i < n-2; i++) {
            if(times[i] != times[i+2]) {
                System.out.println(0);
                return;
            }
        }
        if (isOdd && times[0] != 1) {
            System.out.println(0);
                return;
        }
        System.out.println(factorial(2, n / 2) % 1000000007);
    }
    
    private static long factorial(int a,int n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) res = res * a % 1000000007;
            a = a * a % 1000000007;
            n >>= 1;
        }
        return res;
    }
}
