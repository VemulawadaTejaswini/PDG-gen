import java.util.*;

public class Main {
    public static void insertionSort(int[] A, int N){
        for(int i=1; i<N; i++){
            int v = A[i];
            int j = i-1;
            while(j>=0 && A[j]>v ){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = v;
            
            for(j=0; j<N; j++){
                System.out.print(A[j]);
                if(j!=N-1) System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[100];
        
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            System.out.print(A[i]);
            if(i != N-1) System.out.print(" ");
        }
        System.out.println("");
        
        insertionSort(A,N);
        
        
        
    }
}