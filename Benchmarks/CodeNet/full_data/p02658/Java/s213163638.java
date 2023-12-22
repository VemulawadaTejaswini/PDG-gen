import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        int N = f.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;i++){
            A[i] = f.nextLong();
        }
        long limit = (long)Math.pow(10,18);
        long ans = 1;
        for(int i=0;i<N;i++){
            ans = ans * A[i];
        }
        if(ans > limit || ans < 0){
            System.out.println("-1");
        }
        else{
            System.out.println(ans);
        }
    } 
}