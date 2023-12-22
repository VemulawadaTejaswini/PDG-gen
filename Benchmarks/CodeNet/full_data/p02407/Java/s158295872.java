import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine()) - 1;
        String[] temp = scanner.nextLine().split(" ");

        for (; i != -1; i--) {
            if (i != 0) {

                System.out.print(temp[i] + " ");
            } else {
                System.out.print(temp[i]);
            }
        }
        System.out.println();
        scanner.close();
    }
}

