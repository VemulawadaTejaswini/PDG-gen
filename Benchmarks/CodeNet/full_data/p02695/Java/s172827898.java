import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int q = scan.nextInt();
        int[] a = new int[q];
        int[] b = new int[q];
        int[] c = new int[q];
        int[] d = new int[q];
        for(int i = 0; i < 4 * q; i++){
            switch(i % 4){
                case 0:
                    a[i / 4] = scan.nextInt();
                    break;
                case 1:
                    b[i / 4] = scan.nextInt();
                    break;
                case 2:
                    c[i / 4] = scan.nextInt();
                    break;
                case 3:
                    d[i / 4] = scan.nextInt();
                    break;
            }
        }
        int[] A = new int[n];
        for(int i = 0; i < n / 2; i++){
            A[i] = i + 1;
        }
        for(int i = 0; i < n / 2; i++){
            A[n - i - 1] = m - i;
        }
        if(n % 2 != 0){
            A[n / 2] = (A[n / 2 - 1] + A[n / 2 + 1]) / 2;
        }
        A[0] = 1;
        int sum = 0;
        for(int i = 0; i < q; i++){
            if(A[b[i] - 1] - A[a[i] - 1] == c[i]){
                sum += d[i];
            }
        }
        System.out.println(sum);
    }
}