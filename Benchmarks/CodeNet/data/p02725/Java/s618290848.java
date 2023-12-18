import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long k=sc.nextLong();
        long N=sc.nextLong();
        long[] arr=new long[(int)N];
        int diff=0;
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if (i>1){
                if (Math.abs((arr[i]-arr[i-1])) > diff ){
                        diff= (int) Math.abs((arr[i]-arr[i-1]));
                }
            }
        }
        System.out.println(k-diff);
    }

}
