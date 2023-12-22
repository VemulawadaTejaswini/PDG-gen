import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[];
        A=new int[N];
        for(int i=0;i<N;i++) A[i]=sc.nextInt();
        for(int i=N-1;i>=0;i--){
            System.out.print(A[i]);
            if(i!=0) System.out.print(" ");
        }
        System.out.println();
    }
}
