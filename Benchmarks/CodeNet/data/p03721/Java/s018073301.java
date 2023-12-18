import java.util.Scanner;

public class C_61_BigArray {

    public static void main(String[] args) {
        final int MAX_NUM = 1000000;
        Scanner sc = new Scanner(System.in);

        int[] backet = new int[MAX_NUM + 1];
        int cnt = 0;

        int numberOfIns = sc.nextInt();
        int numberOfArrLength = sc.nextInt();

        for (int i = 0; i < numberOfIns; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            backet[a] += b;
        }

        for (int i = 0; i <= MAX_NUM + 1; i++) {

            if (numberOfArrLength <= cnt + backet[i]) {
                System.out.println(i);
                break;
            }

            cnt += backet[i];
        }

    }

}
