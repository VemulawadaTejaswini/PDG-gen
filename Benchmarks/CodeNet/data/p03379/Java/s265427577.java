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
        for(int i=0;i<N;i++){
            Y[i]=X[i];
        }
        Arrays.sort(Y);
        int l=Y[N/2];
        for(int i=0;i<N;i++){
            if(X[i]<l){
                System.out.println(l);
            }else{
                System.out.println(Y[N/2-1]);
            }
        }

        


}
        
        
    }
