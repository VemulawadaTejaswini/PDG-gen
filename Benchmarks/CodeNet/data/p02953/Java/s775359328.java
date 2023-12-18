import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();
        String line = scanner.nextLine();
        
        String[] values = line.split(" ");
        int[] stairs = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            stairs[i] = Integer.parseInt(values[i]);
        }
        
        int[] newValues = new int[Integer.parseInt(N)];
        newValues[0] = stairs[0];
        
        for (int i = 1; i < stairs.length; i++) {
            if (stairs[i] < stairs[i - 1]) {
                newValues[i - 1] = stairs[i - 1] - 1;
            }
            newValues[i] = stairs[i];
        }
        boolean can = true;
        for (int i = 1; i < newValues.length; i++) {
            if (newValues[i - 1] > newValues[i]) {
                can = false;
                break;
            }
        }
        if (can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
