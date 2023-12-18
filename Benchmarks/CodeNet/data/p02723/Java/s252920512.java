import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String[] s =sc.next().split("");

        System.out.println(s[2].equals(s[3]) && s[4].equals(s[5]) ? "Yes" : "No");
    }
}