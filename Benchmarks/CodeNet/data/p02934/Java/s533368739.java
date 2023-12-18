import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int sum = 0;
        A[0] = scanner.nextInt();
        int l = A[0];

        for(int i = 1; i < N; i ++) {
            A[i] = scanner.nextInt();
            l = lcm(l, A[i]);
        }
        for(int i = 0; i < N; i ++) {
           B[i] = l / A[i];
           sum += B[i];
        }

        System.out.println((double)l/sum);
    }

    static int lcm (int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (int)(c/b);
    }

}