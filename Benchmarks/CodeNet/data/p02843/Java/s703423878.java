import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int xs = Integer.parseInt(x.substring(0, 1));
        int xx = Integer.parseInt(x.substring(1));
        int xxx = xx / xs;
        int xxa = xx % xs;
        if (xxx > 5 || (xxx == 5 && xxa != 0) || (xxx <= 4 && (5 - xxx) * xs < xxa)) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}