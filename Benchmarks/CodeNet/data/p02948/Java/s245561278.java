import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0;i < n;i++){
            a[i] = stdIn.nextInt();
            b[i] = stdIn.nextInt();
        }

        long result = 0L;

        for(int i = 1;i <= m;i++) {
            int max = 0;
            int check = -1;
            for(int j = 0;j < n;j++) {
                if(b[j] > max) {
                    if(a[j] <= i) {
                        max = b[j];
                        check = j;
                    }
                }
            }
            if(check != -1){
                result += b[check];
                a[check] = 10000000; 
            }
        }
        System.out.println(result);
    }

}