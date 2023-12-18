import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N,X;
        N = scan.nextInt();
        X = scan.nextInt();
        int [] L = new int [N];
        for(int i=0;i<N;i++){
            L[i] = scan.nextInt();
        }
        int [] D = new int [N+1];
        D[0] = 0;
        for(int i=1;i<=N;i++){
            D[i] = D[i-1] +L[i-1];
        }
        int count = 0;
        for(int i=0;i<=N;i++){
            if(D[i]<=X){
                count++;
            }
        }
        System.out.println(count);
    }
}