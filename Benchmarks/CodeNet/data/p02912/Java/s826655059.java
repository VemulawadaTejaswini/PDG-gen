import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        int i=0;
        int A[]=new int[N];

        for(i=0;i<N;i++){
            A[i]=sc.nextInt();
        }

        for(i=1;i<=M;i++){
             Arrays.sort(A);
             A[N-1]=A[N-1]/2;
        }

        int total=0;
        for(i=0;i<N;i++){
            total=total+A[i];
        }

        System.out.println(total);
        //END
    }
}

