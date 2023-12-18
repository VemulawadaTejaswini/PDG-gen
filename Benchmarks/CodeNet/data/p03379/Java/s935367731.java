import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]X=new int[N];
        for(int i=0;i<N;i++){
            X[i]=sc.nextInt();
        }
        int[]Y=new int[N];
        Y=Arrays.copyOf(X,N);
        int a=0;
        for(int i=0;i<N;i++){
            X=Arrays.copyOf(Y,N);

            a=X[i];
            X[i]=0;
            Arrays.sort(X);
            System.out.println(X[N/2]);
            
        }


}
        
        
    }
