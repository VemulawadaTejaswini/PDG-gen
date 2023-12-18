import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner stdle = new Scanner(System.in);
        
        int N = stdle.nextint();
        int[] V = new int[N];
        int[] C = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++){
            V[i] = stdle.nextInt();
            C[i] = stdle.nextInt();
            if(V[i] > C[i]){
                sum = sum + (V[i]-C[i]);
            }
        } 

        System.out.println(sum);


    }

} 