import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char paramS[] = scanner.nextLine().toCharArray();
        char paramT[] = scanner.nextLine().toCharArray();

        scanner.close();

        ArrayList<Character> sa = new ArrayList<Character>();
        for (int i = 0; i < paramS.length; i++) {
            sa.add(paramS[i]);
        }
        int currentSIndex = -1;
        int currentRow = 0;
        int result = 0;

        for (char t: paramT) {
            int i = stringIndexOfWithOffset(sa, 0, t);
            int i2 = stringIndexOfWithOffsetArray(paramS, 0, t);
            if (i != i2) {
                System.out.println("違います");
            }
            if (i == -1) {
                result = -1;
                break;
            } else {
                int pos = stringIndexOfWithOffset(sa, currentSIndex + 1, t);
                int pos2 = stringIndexOfWithOffsetArray(paramS, currentSIndex + 1, t);
                if (pos != pos2) {
                    System.out.println("違います");
                }
                if (pos == -1) {
                    currentRow += 1;
                    currentSIndex = i;
                } else {
                    currentSIndex = pos;
                }
            }
        }

        if (result != -1) result = paramS.length * currentRow + currentSIndex + 1;

        System.out.println(result);
    }

    private static int stringIndexOfWithOffset(ArrayList<Character> list, int offset, char c) {
        for (int i = offset; i < list.size(); i++) {
            if (list.get(i) == c) return i;
        }
        return -1;
    }

    private static int stringIndexOfWithOffsetArray(char[] list, int offset, char c) {
        for (int i = offset; i < list.length; i++) {
            if (list[i] == c) return i;
        }
        return -1;
    }
}