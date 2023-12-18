import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int r = Integer.parseInt(array[0]);
            int D = Integer.parseInt(array[1]);
            long x = Integer.parseInt(array[2]);

            for (int i = 2001; i <= 2010; ++i) {
                x = r * x - D;
                System.out.println(x);
            }
        }
    }
}