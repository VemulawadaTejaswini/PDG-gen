import java.util.Scanner;

public class Main {
    static int cnt = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        shellSort(A, n);
        System.out.println(cnt);
        for(int i : A){
            System.out.println(i);
        }
    }

    public static void insertionSort(int[] A, int n, int g){
        for(int i = g; i < n; i++){
            int v = A[i];
            int j = i - g;
            while(j >= 0 && A[j] > v){
                A[j + g] = A[j];
                j = j - g;
                cnt++;
            }
            A[j + g] = v;
        }
    }

    public static void shellSort(int[] A, int n){
        int[] G = new int[15];
        int m = 0;
        for(int i = 1; i <= n; i = i * 3 + 1){
            G[m] = i;
            m++;
        }
        System.out.println(m);
        for(int i = m - 1; i >= 0; i--){
            System.out.print((i == m - 1 ? "" : " ") + G[i] + (i == 0 ? "\n" : ""));
        }
        for(int i = m - 1; i >= 0; i--){
            insertionSort(A, n, G[i]);
        }
    }
}

