import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        insertionSort(A, N);

    }

    private static void insertionSort(int[] A, int N) {
        print(A, N);
        for(int i = 1; i < N; i++){
            int v = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > v){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = v;
            print(A, N);
        }

    }

    private static void print(int[] a, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(a[i]);
            if(i != n -1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());

    }

}

