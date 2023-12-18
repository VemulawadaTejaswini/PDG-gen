import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readLine();
        String[] input = readLine().split("");
        ArrayList<String> afterSort = new ArrayList<>();

        String before = "";
        for (int i = 0; i < input.length; i++) {
            if (before.equals(input[i])) continue;
            afterSort.add(before = input[i]);
        }

        Print(afterSort.size());
    }

    private static final Scanner __in = new Scanner(System.in);
    private static String readLine() {
        return __in.nextLine();
    }

    private static void Print(int m) {
        System.out.println(m);
    }
}
