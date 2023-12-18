import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            int price = 700;
            for (int i = 0; i < 3; ++i) {
                if (line.charAt(i) == 'o') {
                    price += 100;
                }
            }
            System.out.println(price);
        }
    }
}