import java.util.*;

/**
 * TheBalanceoftheWorld
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            String str = sc.nextLine();

            if (str.equals("."))
                break;
            char array[] = str.toCharArray();
            int flg1 = 0, flg2 = 0;

            for (int i = 0; i < array.length; i++) {
                switch (array[i]) {
                case '(':
                    flg1++;
                    break;
                case ')':
                    if (flg1 > 0)
                        flg1--;
                    else {
                        System.out.println("no");
                        continue loop;
                    }

                    break;
                case '[':
                    flg2++;
                    break;
                case ']':
                    if (flg2 > 0)
                        flg2--;
                    else {
                        System.out.println("no");
                        continue loop;
                    }
                    break;
                }
            }

            if (flg1 == 0 && flg2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
