import java.util.*;
import java.lang.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] A = new long[N+1][3];
        for(int i = 1 ; i <= N ; i++){
            A[i][1] = sc.nextLong();
            A[i][2] = sc.nextLong();
        }
        sc.close();
        long AI = 0;
        long BI = 0;
        for(int i = 1 ; i <= N ; i++){
            AI += A[i][1];
            BI = Math.max(BI,A[i][2]);
        }
        if(AI<=BI){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
