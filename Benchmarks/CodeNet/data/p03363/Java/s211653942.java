import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int keta = s.nextInt();

        int[] aArr = new int[keta];

        for (int i = 0; i < keta; i++) {
            aArr[i] = s.nextInt();
        }


        int count = 0;
        for (int i = 0; i < keta; i++) {
            for (int j = i; j < keta; j++) {
                if (i == j) continue;
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += aArr[k];
                }
                if (sum == 0) {
                    //System.out.println("i:" + i + ", j:" + j);
                    //for (int k = i; k < j; k++) {
                    //    System.out.print(aArr[k]);
                    //    System.out.print(", ");
                    //    System.out.println();
                    //}
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
