import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";

        String s = sc.nextLine();
        if (s.indexOf("hi") > -1) ans = "Yes";
        else ans = "No";

        System.out.println(ans);
    }
}
