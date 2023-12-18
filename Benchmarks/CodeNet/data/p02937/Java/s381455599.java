import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static char base[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pS[] = getIntArray(scanner.nextLine().toCharArray());
        int pT[] = getIntArray(scanner.nextLine().toCharArray());
        scanner.close();

        ArrayList<Integer> sa = new ArrayList<Integer>();
        for (int i = 0; i < pS.length; i++) {
            sa.add(pS[i]);
        }
        int currentSIndex = -1;
        int currentRow = 0;
        int result = 0;

        for (int t: pT) {
            int i = sa.indexOf(t);
            if (i == -1) {
                result = -1;
                break;
            } else {
                int pos = stringIndexOfWithOffset(sa, currentSIndex + 1, t);
                if (pos == -1) {
                    currentRow += 1;
                    currentSIndex = i;
                } else {
                    currentSIndex = pos;
                }
            }
        }

        if (result != -1) result = pS.length * currentRow + currentSIndex + 1;

        System.out.println(result);
    }

    private static int stringIndexOfWithOffset(ArrayList<Integer> list, int offset, int n) {
        for (int i = offset; i < list.size(); i++) {
            if (list.get(i) == n) return i;
        }
        return -1;
    }

    private static int[] getIntArray(char[] o) {
        int[] tmp = new int[o.length];
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < base.length; j++) {
                if (o[i] == base[j]) {
                    tmp[i] = base[j];
                    break;
                }
            }
        }
        return tmp;
    }
}