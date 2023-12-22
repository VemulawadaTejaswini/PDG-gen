import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();
        long[] X = new long[N];
        long[] Y = new long[N];
        for(int i=0; i<N; i++){
            X[i] = scan.nextLong();
            Y[i] = scan.nextLong();
        }
        scan.close();

        int count=0;
        for(int i=0; i<N; i++){
            long dist = (long)(Math.sqrt(X[i]*X[i] + Y[i]*Y[i]));
            if(dist <= D){
                count++;
            }
        }

        System.out.println(count);
    }
}