import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] A = new int[3][N];
        for(int i = 0; i < N; i++){
            A[0][i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            A[1][i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            A[2][i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(A[0]);
        Arrays.sort(A[1]);
        Arrays.sort(A[2]);
        
        long sum = 0;
        /*for(int i = 0; i < N; i++){
            System.out.println(A[0][i]);
            if(i == N-1){
                System.out.println();
            }
        }
        for(int i = 0; i < N; i++){
            System.out.println(A[1][i]);
            if(i == N-1){
                System.out.println();
            }
        }
        for(int i = 0; i < N; i++){
            System.out.println(A[2][i]);
            if(i == N-1){
                System.out.println();
            }
        }*/
        
        for(int i = 0; i < N; i++){
            //System.out.println(Binary_search(A[0], A[1][i]) + " " + Binary_search(A[2], A[1][i]+1));
            sum += (long)(Binary_search(A[0], A[1][i]) * (N-Binary_search(A[2], A[1][i]+1)));
        }
        System.out.println(sum);
    }

    static int Binary_search(int[] a, int n){
        int lower = -1;
        int upper = a.length;
        while(upper-lower != 1){
            int mid = (lower+upper) / 2;
            if(a[mid] < n){
                lower = mid;
            } else {
                upper = mid;
            }
        }
        return lower+1;
    }
}