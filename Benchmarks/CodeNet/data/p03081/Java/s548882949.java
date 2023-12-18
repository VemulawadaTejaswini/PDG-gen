

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
                index++;
                current = s.charAt(index);
                if (leftMaxIndex == s.length() - 1) {
                    break;
                }
            }
        }

        // find rightDroppedMinIndex
        int rightMinIndex = s.length();
        index = s.length() - 1;
        current = s.charAt(index);
        for (int i = q - 1; i >= 0; --i) {
            if (d[i].equals("R") && t[i].charAt(0) == current) {
                rightMinIndex = index;
                --index;
                current = s.charAt(index);
                if (rightMinIndex == 0) {
                    break;
                }
            }
        }
        int leftDropped = leftMaxIndex + 1;
        int rightDropped = s.length() - rightMinIndex;
        System.out.println((n - leftDropped - rightDropped));

    }

}
