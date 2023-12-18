import java.util.Scanner;

public class Main {
    public static void main(String[] atrgs){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N];
        for(int i = 0; i < N+1; i++) {
            A[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        int count= 0;
        for(int i = 0; i < N; i++) {
            if(B[i] <= A[i]){
                count += B[i];
            }else{
                count += A[i];
                B[i] -= A[i];
                if(B[i] <= A[i+1]){
                    count += B[i];
                    A[i+1] -= B[i];
                }else{
                    count += A[i+1];
                    A[i+1] = 0;
                }
            }
        }
        System.out.println(count);
    }
}
