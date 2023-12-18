import java.util.Scanner;

public class abc081a {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        final String s = scanner.next().replaceAll("0", "");
        System.out.println(s.length());
    }
}
