import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    int H=sc.nextInt();
    int W=sc.nextInt();
    int D=sc.nextInt();
    int[][]A=new int[H][W];
    for(int i=0;i<H;i++){
        for(int j=0;j<W;j++){
            A[i][j]=sc.nextInt();
        }
    }
    int Q=sc.nextInt();
    int[]L=new int[Q];
    int[]R=new int[Q];
    for(int i=0;i<Q;i++){
        L[i]=sc.nextInt();
        R[i]=sc.nextInt();
    }
    for(int k=0;k<Q;k++){
        int sum=0;
        int x=0;
        int y=0;

    for(int i=0;i<H;i++){
        for(int j=0;j<W;j++){
            if(L[k]==A[i][j]){
                x=i;
                y=j;
            }


        }
    }
    for(int i=0;L[k]!=R[k];i++){
        L[k]+=D;
        for(int l=0;l<H;l++){
        for(int j=0;j<W;j++){
            if(L[k]==A[l][j]){
                sum+=Math.abs(x-l);
                sum+=Math.abs(y-j);
                x=l;
                y=j;
                
                }
            }


        }}
        if(L[k]==R[k]){
            System.out.println(sum);
            
        

        
        
    }
    

}

    }
}