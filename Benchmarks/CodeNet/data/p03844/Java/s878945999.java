import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parsedLine = line.split(" ");
        Integer a = Integer.parseInt(parsedLine[0]);
        String op = parsedLine[1];
        Integer b = Integer.parseInt(parsedLine[2]);

        if ("+" == op) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }
    }
}