import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        Arrays.sort(x);
        int min=100000000;
        for(int i=x[0];i<=x[n-1];i++){
            int tmp=0;
            for(int j=0;j<n;j++){
                tmp+=Math.pow(x[j]-i,2);
            }
            if(tmp<min){
                min=tmp;
            }
        }
        System.out.println(min);
    }
}