import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        System.out.println(Math.max(Integer.parseInt(lines[0]), Integer.parseInt(lines[1])) == Math.min(Integer.parseInt(lines[1]), Integer.parseInt(lines[2])) ? "Yes" : "No");
    }
}