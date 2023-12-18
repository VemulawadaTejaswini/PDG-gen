import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        if (a >= 3200) {
            System.out.println(s);
        } else {
            System.out.println("red");
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
