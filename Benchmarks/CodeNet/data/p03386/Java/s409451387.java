import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int A=sc.nextInt();
        int B=sc.nextInt();
        int K=sc.nextInt();
        int[]aa=new int[B+1];
        for(int i=0;i<K;i++){
            if(A+i<=B){
                aa[A+i]++;
            }
        }
        for(int i=0;i<K;i++){
            if(A<=B-i){
                aa[B-i]++;
            }
        }
        for(int i=A;i<=B;i++){
            if(aa[i]>0){
                System.out.println(i);
            }
        }

}
        
        
    }
