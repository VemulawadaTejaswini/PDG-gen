import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] a = sc.nextLine().split(" ");
        double asum = 0d;
        for (int i = 0; i < n; i++) {
            asum += 1.0d / Double.parseDouble(a[i]);
        }
        System.out.println(1.0d / asum);
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
