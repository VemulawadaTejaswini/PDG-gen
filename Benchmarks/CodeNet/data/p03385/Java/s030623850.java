import java.util.*;

public class Main{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int C = ((B-A)+1);
        int E = (C-1);
        int F = (K-1);

        int D[] = new int[C];

        for(int i = 0;i < C;i++){
            D[i] = A;
            A = (A+1);
        }

        for(int i = 0;i < K;i++){
            System.out.println(D[i]);
        }

        if((C/2)>=K){
            for(int i = (0-F);i <= 0;i++){
                System.out.println(D[C+i]);
            }
        }
            
        
    }
}