import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int n = Integer.parseInt(lines[1]);
        lines = sc.nextLine().split(" ");
        int sum = Integer.parseInt(lines[1]);
        String result = lines[0];
        while (n > sum && sc.hasNextLine()) {
            lines = sc.nextLine().split(" ");
            sum += Integer.parseInt(lines[1]);
            result = lines[0];
        }
        System.out.println(result);
    }
}