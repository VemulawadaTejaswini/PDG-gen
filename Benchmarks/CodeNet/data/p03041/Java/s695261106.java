import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int con = Integer.parseInt(in.nextLine().split(" ")[1]) + 1;
        String str = in.nextLine();
        in.close();
        String ans = str.substring(0, con) + String.valueOf(str.charAt(con) + 32) + str.substring(con + 1);
        System.out.println(ans);
    }
}
