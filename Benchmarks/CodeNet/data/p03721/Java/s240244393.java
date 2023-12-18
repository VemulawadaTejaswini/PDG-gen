import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        long[] arrays = new long[(int)1e5 + 1];

        for(int i=0; i<N; i++){
            int a = scanner.nextInt();
            long b = scanner.nextLong();

            arrays[a] += b;
        }

        for(int i=1; i <= (int)1e5; i++){

            if(arrays[i]==0){
                continue;
            }

            if(K <= arrays[i]){
                System.out.println(i);
                return;
            }

            K -= arrays[i];

        }
    }
}
