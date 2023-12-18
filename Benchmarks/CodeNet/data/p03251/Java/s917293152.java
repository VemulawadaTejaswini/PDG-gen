import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int[] A = new int[N];
        int[] B = new int[M];
        for(int n=0;n<N;n++) A[n]=sc.nextInt();
        for(int m=0;m<M;m++)B[m]=sc.nextInt();
        
        int maxA = X;
        int minB = Y;
        for(int n=0;n<N;n++) maxA = Math.max(maxA,A[n]);
        for(int m=0;m<M;m++) minB = Math.min(minB,B[m]);
        
        if(maxA<minB) System.out.println("No War");
        else System.out.println("War");
        
    }
}
