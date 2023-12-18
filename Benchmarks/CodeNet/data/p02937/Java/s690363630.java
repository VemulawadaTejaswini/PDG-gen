import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String paramS[] = scanner.nextLine().split("");
        String paramT[] = scanner.nextLine().split("");
        scanner.close();

        ArrayList<String> sa = new ArrayList(Arrays.asList(paramS));
        int currentSIndex = -1;
        int currentRow = 0;
        int result = 0;

        outside: for (String t: paramT) {
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

        if (result != -1) result = paramS.length * currentRow + currentSIndex + 1;

        System.out.println(result);
    }

    private static int stringIndexOfWithOffset(ArrayList<String> list, int offset, String str) {
        for (int i = offset; i < list.size(); i++) {
            if (list.get(i).equals(str)) return i;
        }
        return -1;
    }
}