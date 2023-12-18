import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int K=sc.nextInt();
        if(B-K+1<=A+K-1){
            for(int i=0;i<=B-A;i++){
                System.out.println(A+i);
            }
        }else{
            for(int i=0;i<K;i++){
                System.out.println(A+i);
            }
            for(int i=K-1;i>=0;i--){
                System.out.println(B-i);
            }
        }


}
        
        
    }
