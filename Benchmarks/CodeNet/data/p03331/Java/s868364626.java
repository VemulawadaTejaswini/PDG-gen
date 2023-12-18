import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < x; j++) {
                int total = i + j;
                if (total == x) {
                    int sum = foreach(i, j);
                    if (min > sum) min = sum;
                }
            }
        }
        System.out.println(min);
    }
    private static int foreach(int i, int j) {
        char[] ichar = Integer.toString(i).toCharArray();
        char[] jchar = Integer.toString(j).toCharArray();
        int sum = 0;
        for (char c : ichar) {
            sum += Character.getNumericValue(c);
        }
        for (char c : jchar) {
           sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
