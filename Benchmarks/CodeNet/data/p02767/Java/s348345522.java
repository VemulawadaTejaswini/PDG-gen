import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int minval = 100;
        int maxval = 0;
        for(int i=0; i<N; i++) {
            X[i] = sc.nextInt();
            if(X[i]<minval) minval=X[i];
            if(X[i]>maxval) maxval=X[i];
        }
        long result = Long.MAX_VALUE;
        for(int i=minval; i<=maxval; i++) {
            long tmpsum = 0;
            for(int t=0; t<N; t++) {
                tmpsum += (X[t]-i)*(X[t]-i);
            }
            if(tmpsum<result) result=tmpsum;
        }
        System.out.println(result);
    }
}
