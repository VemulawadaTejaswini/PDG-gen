import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            int []a = new int[3];
                int len []= new int[3];
                for (int j = 0; j<3; j++) {
                    len[j]=sc.nextInt();
                }
            Arrays.sort(a);

            if (len[0] * len[0] + len[1] * len[1]==len[2] * len[2]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}