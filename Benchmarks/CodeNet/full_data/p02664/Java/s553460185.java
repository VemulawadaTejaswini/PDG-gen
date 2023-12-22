import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String ret = t.replace("?", "D");
//       String ret = t.replace("?D", "PD");
//       ret = t.replace("?", "D");

        System.out.printf(ret);
    }
}
