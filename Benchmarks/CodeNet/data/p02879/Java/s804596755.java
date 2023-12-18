import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        String[] abs = ab.split(" ");
        int a = Integer.parseInt(abs[0]);
        int b = Integer.parseInt(abs[1]);
        if (a >= 10 || b >= 10) {
            System.out.println(-1);
            return;
        }
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
