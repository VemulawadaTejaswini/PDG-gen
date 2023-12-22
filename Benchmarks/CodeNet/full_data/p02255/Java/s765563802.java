import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int A[] = new int[N];
        Scanner a = new Scanner(System.in);
        for(int i=0; i < N; i++){
            A[i] = a.nextInt();
        }
        for(int i = 1; i < N ; i++){
            int v = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > v){
                A[j+1] = A[j];
                j--;
                A[j+1] = v;
            }
            for(int k=0; k<N; k++){
                System.out.print(A[k] + " ");
            }
            System.out.println("");
        }
    }
}
