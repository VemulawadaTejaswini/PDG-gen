import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        long[] arrays = new long[(int)1e5 + 1];

        for(int i=0; i<N; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            arrays[a] += b;
        }

        long acc = 0;

        for(int i=0; i<(int)1e5 + 1; i++){

            if(i == (int)1e5){
                System.out.println((int)1e5);
                return;
            }

            if(arrays[i]==0){
                continue;
            }

            acc += arrays[i];

            if(K <= acc){
                System.out.println(i);
                return;
            }
        }
    }
}