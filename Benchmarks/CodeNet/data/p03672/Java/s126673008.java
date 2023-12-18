
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] S = scan.nextLine().toCharArray();
        int length = S.length - 1;
        length = (length/ 2) * 2;
        for (; length >= 0; length -= 2) {
            boolean flag = true;
            for (int i = 0; i < length / 2; i++)  {
                if(S[i] != S[length - i - 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(length);
                return;
            }
        }

    }
}
