import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();
        int n = Integer.parseInt(N);
        String line = scanner.nextLine();
        String[] strs = line.split(" ");
        int[] values = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            values[i] = Integer.parseInt(strs[i]);
        }

        boolean[] changed = new boolean[n];
        int[] newValues = new int[values.length];
        newValues[0] = values[0];
        for (int i = 1; i < values.length; i++) {
            newValues[i] = values[i];
            if (values[i] < values[i - 1]) {
                newValues[i - 1] = values[i - 1] - 1;
                changed[i - 1] = true;
            }
        }
        boolean can = true;
        for (int i = 1; i < newValues.length; i++) {
            if (newValues[i] < newValues[i - 1]) {
                if (!changed[i - 1]) {
                    newValues[i - 1] = newValues[i - 1] - 1;
                } else {
                    can = false;
                    break;
                }
            }
        }
        if(can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}