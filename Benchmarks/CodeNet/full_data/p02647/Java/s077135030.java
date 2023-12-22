import java.io.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int K=sc.nextInt();

        int[] A=new int[40000];
        int[] B=new int[40000];

        int c=0;
		int NN=N+20000;
      
        int in=0;
        for(in=20000;in<NN;in++){
            A[in]=sc.nextInt();
            B[in]=0;
        }

        int g=0;
        int h=0;
        int i=0;
        int j=0;

        for(g=0;g<K;g++){
            for(h=20000;h<NN;h++){
                for(i=h-A[h];i<=h+A[h];i++){
                    B[i]++;
                }

                if(h==NN-1){
                  for(j=20000;j<NN;j++){
                    A[j]=B[j];
                    B[j]=0;
                  }
                }
            }
        }  
        for(in=20000;in<NN;in++){
            System.out.print(A[in]+"\t");
        }

        //END
    }
}