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
        
        for(int i = 0; i < N; i++){
            sum += Binary_left(A[0], A[1][i]) * (N-Binary_right(A[2], A[1][i]));
        }
        System.out.println(sum);
    }

    static int Binary_left(int[] a, int n){
        int pos = -1;
        int lower = 0;
        int upper = a.length-1;
        while(lower <= upper){
            int mid = (lower + upper) / 2;
            if((mid+1 <= a.length-1 && a[mid] < n && n <= a[mid+1]) || (mid == a.length-1 && a[mid] <= n)){
                pos = mid;
                break;
            }else if(mid == 0 && n < a[mid]){
                pos = -1;
                break;
            }
             else if(a[mid] < n){
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return (pos+1);
    }

    static int Binary_right(int[] a, int n){
        int pos = -1;
        int lower = 0;
        int upper = a.length-1;
        while(lower <= upper){
            int mid = (lower + upper) / 2;
            if((mid+1 <= a.length-1 && a[mid] <= n && n < a[mid+1]) || (mid == a.length-1 && a[mid] <= n)){
                pos = mid;
                break;
            } else if(mid == 0 && a[mid] >= n){
                pos = -1;
                break;
            } else if(a[mid] < n){
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return (pos+1);
    }
}