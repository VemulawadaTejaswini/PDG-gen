import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int N = Integer.parseInt(sc.nextLine());
            int[] A = new int[N];
            int total = 0;
            for (int i = 0; i < N; i ++) {
                A[i] = Integer.parseInt(sc.next());
                total += A[i];
            }
            int half = total / 2;
            int addValue = 0;
            int halfCnt = 0;
            for (int i = 0; i < N; i ++) {
                if (half > addValue){
                    addValue += A[i];
                    halfCnt++;
                } else {
                    break;
                }
            }
            int nextValue = 0;
            for (int i = halfCnt; i < N; i ++) {
                    nextValue += A[i];
            }

            System.out.println(Math.abs(addValue - nextValue));
       }
    }
}