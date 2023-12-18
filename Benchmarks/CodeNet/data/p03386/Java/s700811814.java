import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int K=sc.nextInt();
        int[]a=new int[B+10];
        for(int i=0;i<B+10;i++){
            a[i]=0;
        }
        for(int i=0;i<K;i++){
            if(A+i<=B){
            a[A+i]++;}
        }
        for(int i=0;i<K;i++){
            if(B-i>=A){
            a[B-i]++;}
        }
        for(int i=0;i<B+3;i++){
            if(a[i]>0){
                if((A<=i)&&(i<=B))
                System.out.println(i);
            }
        }


}
        
        
    }
