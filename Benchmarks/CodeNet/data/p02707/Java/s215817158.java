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

        int num = 0;    //直属の部下の人数

        for(int i = 0; i < A.length; i++) {
            for(int j = i + 1; j < A.length; j++) {
                if(A[j] == A[i] + 1) {
                    num++;
                } else {
                    break;
                }
            }
            if(i > 0) {
                if(A[i] == A[i - 1]) {
                    num = 0;
                }
            }
            System.out.println(num);    //直属の部下の人数を表示
            num = 0;
        }
    }
}
