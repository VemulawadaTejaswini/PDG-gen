import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long a[] = new long[n+1];
        long b[] = new long[n];
        for(int i = 0;i < n+1;i++) {
            a[i] = stdIn.nextLong();
        }
        for(int i = 0;i < n;i++){
            b[i] = stdIn.nextLong();
        }
        long count = 0L;
        for(int i = 0;i < n-1;i++) {
            if(a[i] <= b[i]){
                count += a[i];
                b[i+1] += (b[i] - a[i]);
            }else {
                count += b[i];
            }
        }
        if(a[n-1] < b[n-1]){
            count += a[n-1];
            b[n-1] -= a[n-1];
            if(a[n] < b[n-1]){
                count += a[n];
            }else{
                count += b[n-1];
            }
            System.out.println(count);
            System.exit(0);
        }else {
            count += b[n-1];
            System.out.println(count);
            System.exit(0);
        }

        
    }
}