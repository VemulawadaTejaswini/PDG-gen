import java.util.*;
     
class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] A = new int[n];
        int i;
        for(i=0; i<n; i++) A[i] = stdIn.nextInt();
        for(i=0; i<n; i++) System.out.print(A[i]+ " ");
        System.out.println();
        int j, key;
        for(i=1; i<n-1; i++){
            key = A[i];
            j = i-1;
            while(j != 0 && A[j] > key){
                A[j+1] = A[j];
                j--;
            }
            A[j] = key;
            for(i=0; i<n; i++) System.out.print(A[i]+ " ");
        System.out.println();
        }
    }
}