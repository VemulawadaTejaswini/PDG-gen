import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        long k = stdIn.nextLong();

        long[] aAcc = new long[n];
        long[] bAcc = new long[m];
        for(int i=0; i<n; i++){
            aAcc[i] = stdIn.nextLong();
        }
        for(int i=0; i<m; i++){
            bAcc[i] = stdIn.nextLong();
        }

        int max = 0;
        int i = -1;
        int j = -1;
        long sum = 0;
        while(sum + bAcc[j+1] <= k){
            sum += bAcc[j+1];
            j++;
            if(j == m-1)
                break;
        }
        max = j + 1;
        j--;
        Outer:
        for(i=0; i<n; i++){
            sum += aAcc[i];
            while(sum > k){
                if(j < 0)
                    break Outer;
                sum -= bAcc[j];
                j--;

            }
            if(max < i + j + 2)
                max = i + j + 2;
        }

        System.out.println(max);
    }
}
