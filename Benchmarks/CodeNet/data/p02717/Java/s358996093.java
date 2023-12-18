import java.util.Scanner;
import java.util.StringJoiner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        String z = scanner.nextLine();
        String result = String.join(" ", z, x, y);
        System.out.println(result);
    }
}