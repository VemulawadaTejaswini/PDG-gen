import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i] = a.nextInt();
        }
        int minj;
        int count = 0;
        for(int i=0; i<n; i++){
            minj = i;
            for(int j=i+1; j<n; j++){
                if(A[j] < A[minj]){
                    minj = j;
                }
            }
            int x = A[i];
            A[i] = A[minj];
            A[minj] = x; 
            count++;
        }
        for(int i=0; i<n; i++){
            System.out.print(A[i]);
            if(i<n-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
