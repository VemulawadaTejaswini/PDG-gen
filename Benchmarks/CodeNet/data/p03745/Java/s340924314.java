import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();

            int i = 0;
            int count = 1;
            while(i < N-2){
                
                if(((A[i+1]>A[i])&&(A[i+2]<A[i+1]))||
                    ((A[i+1]<A[i]) &&(A[i+2]>A[i+1]))){
                    count++;
                    i++;
                }
                i++;
            }
            System.out.println(count);
    }
}