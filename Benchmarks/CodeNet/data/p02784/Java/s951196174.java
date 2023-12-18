import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();

        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n]=sc.nextLong();

        long damage = 0;
        for(int n=0; n<N; n++) damage += A[n];
        if(H<=damage) System.out.println("Yes");
        else System.out.println("No");
    }
}
