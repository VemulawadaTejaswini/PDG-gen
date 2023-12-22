import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] A = new int[N];
            int c = 0;
            int d = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N ; j++) {
                    if ( A[i]%A[j] == 0) {
                        c = c + 1;
                    } else {
                        c = c;
                    }
                }
                if ( c == 1) {
                    d = d + 1;
                } else {
                    d = d;
                }
                c = 0;
            }
            System.out.println(d);
    }
}