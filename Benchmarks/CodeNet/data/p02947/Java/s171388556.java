import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String d[] = new String[n];
        for (int i = 0; i < n; i++) {
            String[] c = scanner.nextLine().split("");
            Arrays.sort(c);
            d[i] = String.join("", c);
        }
        scanner.close();

        int c = 0;
        for (int i = 0; i < d.length; i++) {
            c += getDupCount(i, d);
        }
        
        System.out.println(c);
    }

    private static int getDupCount(int index, String[] data) {
        int c = 0;
        for (int i = index + 1; i < data.length; i++) {
            if (data[index].equals(data[i])) c++;
        }
        return c;
    }
}