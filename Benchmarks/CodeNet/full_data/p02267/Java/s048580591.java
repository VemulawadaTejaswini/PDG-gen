import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []S = new int[n + 1];
        for(int i = 0; i < n; i++) {
            S[i] = scan.nextInt();
        }
        int q = scan.nextInt();
        int []T = new int[q];
        for(int i = 0; i < q; i++) {
            T[i] = scan.nextInt();
        }
        scan.close();
        int sum = 0;
        for(int i = 0; i < q; i++) {
            if(search(S, n, T[i]) == 1) {
                sum ++;
            }
        }
        System.out.println(sum);
    }
    public static int search(int A[], int n, int key) {
        int i = 0;
        A[n] = key;
        while(A[i] != key) {
            i ++;
        }
        if(i != n) {
            return 1;
        }
        return 0;
    }
}

