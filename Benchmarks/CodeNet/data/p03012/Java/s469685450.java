import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long W[] = new long[N];
        long sum = 0L;
        for(int i=0; i<N; i++) {
            W[i]=sc.nextLong();
            sum+=W[i];
        }
        long result = Long.MAX_VALUE;
        long tmpsum = 0L;
        for(int i=0; i<N; i++) {
            tmpsum+=W[i];
            long tmpdiff = Math.abs(tmpsum - (sum-tmpsum));
            if(tmpdiff<=result) result=tmpdiff;
        }
        System.out.println(result);
    }
}