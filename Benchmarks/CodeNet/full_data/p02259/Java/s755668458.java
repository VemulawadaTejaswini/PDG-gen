import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int count = BubbleSort(A, N);
        for(int i = 0; i < N; i++){
            if(i < N - 1){
                System.out.print(A[i] + " ");
            }else{
                System.out.print(A[i]);
            }
        }
        System.out.println("");
        System.out.println(count);
    }

    public static int BubbleSort(int[] a, int n){
        boolean TF = true;
        int i = 0;
        int c = 0;
        while(TF){
            TF = false;
            for(int j = n - 1; j >= i + 1; j--){
                if(a[j] < a[j - 1]){
                    int x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;
                    TF = true;
                    c++;
                }
            }
            i++;
        }
        return c;
    }
}
