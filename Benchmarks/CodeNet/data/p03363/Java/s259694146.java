import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int answer = 0;
        for (int i = 1; i < N; i++) {  // i = 大きさ
            // しゃくとり初期化
            int position = i - 1;
            int shaku = 0;
            for (int j = 0; j < i; j++) {
                shaku += A[j];
            }

            while (true) {
                if (shaku == 0) { answer += 1; }
                position++;
                if (position == N) { break; }
                shaku -= A[position-i];
                shaku += A[position];
            }
        }

        System.out.println(answer);
    }
}
