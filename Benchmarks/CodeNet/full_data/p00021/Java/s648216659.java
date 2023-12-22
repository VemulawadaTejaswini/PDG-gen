import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");

            double x1 = Double.parseDouble(values[0]);
            double y1 = Double.parseDouble(values[1]);
            double x2 = Double.parseDouble(values[2]);
            double y2 = Double.parseDouble(values[3]);
            double x3 = Double.parseDouble(values[4]);
            double y3 = Double.parseDouble(values[5]);
            double x4 = Double.parseDouble(values[6]);
            double y4 = Double.parseDouble(values[7]);

            double det = (x2 - x1) * (y4 - y3) - (y2 - y1) * (x4 - x3);

            System.out.println(det == 0.0 ? "YES" : "NO");
        }
    }
}