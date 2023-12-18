import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //N K
        String inputs1 = s.nextLine();
        String[] inputS1 = inputs1.split(" ");
        int N = Integer.valueOf(inputS1[0]);
        int K = Integer.valueOf(inputS1[1]);
        inputs1 = null;
        inputS1 = null;

        //A(0) -> A(n-1)
        String inputs2 = s.nextLine();
        String[] inputS2 = inputs2.split(" ");
        int[] aArray = new int[N];
        for (int i = 0; i < N; i++) {
            aArray[i] = Integer.valueOf(inputS2[i]);
        }

        //単純な内容検査
        long sum = 0;
        for (int i = 0; i < K*N; i++) {
            //繰り返し前の保有数
            for (int j = i + 1; j < N; j++) {
                if (aArray[i%N] > aArray[j]) sum++;
            }
            //繰り返し後の保有数
            for (int j = 1; j < K; j++) {
                for (int k = 0; k < N; k++) {
                    if (aArray[i%N] > aArray[k]) sum++;
                }
            }
        }
        long result = sum % (10^9 + 7);

        System.out.println(result);
    }
}
