import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] A = new int[N];

        A[0] = 0;

        for(int i = 1; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        int count = 0;    //直属の部下の人数

        int num = -1;
        for(int i = 0; i < A.length; i++) {
            if(i > 0) {
                if(A[i] == num) {
                    count = 0;
                    System.out.println(0);
                    continue;
                } else {
                    num = A[i];
                }
            }
            for(int j = i + 1; j < A.length; j++) {
                if(A[j] - 1 == A[i]) {
                    count++;
                }
            }
            System.out.println(count);    //直属の部下の人数を表示
            count = 0;
        }
    }
}
