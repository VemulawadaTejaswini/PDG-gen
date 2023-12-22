import java.util.*;

public class Main{

    public static int select(int A[],int N){
        int cnt=0;
        for(int i=0;i<N;i++){
            int minj=i;
            for(int j=i;j<N;j++){
                if(A[j]<A[minj]){
                    minj = j;
                }
            }
            if(minj!=i){
                int t=A[i];
                A[i]=A[minj];
                A[minj]=t;
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A;
        int count;
        A = new int[100];


        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        count=select(A,N);

        for(int i=0;i<N;i++){
            System.out.print(A[i]);
            if(i!=N-1)  System.out.print(" ");
        }
        System.out.println("\n"+count);

    }
}
