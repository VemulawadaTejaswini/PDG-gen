import java.util.Scanner;

/** AtCoder Beginner Contest 140 - A **/
public class Main {

    private Main() {}

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println((int)(Math.pow(Integer.parseInt(n), 3)));
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}