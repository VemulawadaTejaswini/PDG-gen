import java.util.*;
import java.lang.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] A = new long[N+1][3];
        boolean T = true;
        for(int i = 1 ; i <= N ; i++){
            A[i][1] = sc.nextLong();
            A[i][2] = sc.nextLong();
            if(A[i][1] > A[i][2]){
                T = false;
            }
        }
        sc.close();
        boolean U = true;
        long AI = 0;
        long BI = 0;
        for(int i = 1 ; i <= N ; i++){
            AI += A[i][1];
            BI = Math.max(BI,A[i][2]);

            if(AI>BI){
                U = false;
                break;
            }
        }
        if(AI<=BI && T && U){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
