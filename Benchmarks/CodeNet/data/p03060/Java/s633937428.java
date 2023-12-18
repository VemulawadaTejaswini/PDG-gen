import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] V=new int[n], C=new int[n];
        
        for(int i=0; i<n; i++)
            V[i] = sc.nextInt();
        for(int i=0; i<n; i++)
            C[i] = sc.nextInt();
        
        int sum = 0;
        for(int i=0; i<n; i++)
            if(V[i] > C[i])
                sum += V[i] - C[i];
        
        System.out.println(sum);
    }
}
