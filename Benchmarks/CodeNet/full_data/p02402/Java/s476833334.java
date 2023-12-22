import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            scan.nextLine();
            String[] line = scan.nextLine().split(" ");

            int min = Integer.parseInt(line[0]);
            int max = Integer.parseInt(line[0]);
            int sum = 0;
            int num = 0;

            for (int i = 0; i < line.length; i++) {
                num = Integer.parseInt(line[i]);

                if (num < min) min = num;
                if (num > max) max = num;

                sum += num;
            }

            System.out.println(min + " " + max + " " + sum);
        }

    }

}

