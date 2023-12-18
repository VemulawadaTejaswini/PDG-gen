import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int count0 = 0;
        int count1 = 0;
        boolean flg = true;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == (flg ? '0' : '1')) {
                count0++;
            } else {
                count1++;
            }
            flg = !flg;
        }

        System.out.println(Math.min(count0, count1));
    }
}
