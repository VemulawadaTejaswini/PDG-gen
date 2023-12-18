import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        long H = Long.parseLong(line1[0]);
        long N = Long.parseLong(line1[1]);
        sc.close();

        long sum = 0;
        for (String string : line2) {
            sum += Long.parseLong(string);
        }

        String res = "No";

        if (sum >= H) {
            res = "Yes";
        }

        System.out.println(res);
    }

}