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
        int[]M=new int[N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                M[j]=X[j];
            }
            M[i]=0;
            Arrays.sort(M);
            System.out.println(M[N/2]);
        }


}
        
        
    }
