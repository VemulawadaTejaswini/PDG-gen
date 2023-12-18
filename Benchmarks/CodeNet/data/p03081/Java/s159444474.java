
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        String[] t = new String[q];
        String[] d = new String[q];
        for (int i = 0; i < q; ++i) {
            t[i] = scanner.next();
            d[i] = scanner.next();
        }
        // find leftDroppedMaxIndex
        int leftMaxIndex = -1;
        int index = 0;
        char current = s.charAt(0);
        for (int i = q - 1; i >= 0; --i) {
            if (d[i].equals("L") && t[i].charAt(0) == current) {
                leftMaxIndex = index;
                if (leftMaxIndex == s.length() - 1) {
                    break;
                }
                index++;
                current = s.charAt(index);
            } else if (d[i].equals("R") && index - 1 >= 0 &&
                    t[i].charAt(0) == s.charAt(index - 1)) {
                leftMaxIndex--;
                --index;
                current = s.charAt(index);
            }
        }

        // find rightDroppedMinIndex
        int rightMinIndex = s.length();
        index = s.length() - 1;
        current = s.charAt(index);
        for (int i = q - 1; i >= 0; --i) {
            if (d[i].equals("R") && t[i].charAt(0) == current) {
                rightMinIndex = index;
                if (rightMinIndex == 0) {
                    break;
                }
                --index;
                current = s.charAt(index);
            } else if (d[i].equals("L") && index + 1 < s.length() &&
                    t[i].charAt(0) == s.charAt(index + 1)) {
                rightMinIndex++;
                ++index;
                current = s.charAt(index);
            }
        }
        int leftDropped = leftMaxIndex + 1;
        int rightDropped = s.length() - rightMinIndex;
        System.out.println((n - leftDropped - rightDropped));

    }

}
