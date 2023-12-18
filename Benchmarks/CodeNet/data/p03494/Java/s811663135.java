import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int a=0;
        out:for(;;){
        for(int i=0;i<N;i++){
            if(A[i]%2==1){
                break out;
            }
            A[i]=A[i]/2;
            if(i==N-1){
                a++;
            }
        }}
        System.out.println(a);


}
        
        
    }
