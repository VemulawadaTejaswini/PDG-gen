import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long k=sc.nextLong();
        long N=sc.nextLong();
        long[] arr=new long[(int)N];
        int max=0;
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if (i>1){
                max = (int) Math.max(arr[i] - arr[i - 1], max);
            }
        }
        max = (int) Math.max(k - arr[(int) (N - 1)] + arr[0], max);
        System.out.println(k-max);
    }

}
