import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String len = Integer.toString(s.length()-2);
        System.out.println(s.charAt(0) + len + s.charAt(s.length()-1));
    }
}
