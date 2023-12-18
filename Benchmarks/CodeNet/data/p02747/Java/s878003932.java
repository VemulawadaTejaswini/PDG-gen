import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.contains("hi")) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();
    }
}