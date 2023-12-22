import java.util.Scanner;

public class Main {
    static void checkArray(int[] a){
        int i ;
        for( i = 0; i < a.length -1; i++){
                System.out.print(a[i] +" ");
        }
        System.out.print(a[i]);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        checkArray(arr);
        
        for(int i = 1; i <= N-1; i++) {
            int v = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > v ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = v;
            checkArray(arr);
        }   
    }   
}