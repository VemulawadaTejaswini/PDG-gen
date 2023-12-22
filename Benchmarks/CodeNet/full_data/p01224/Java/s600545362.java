import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        CustomReader cr = new CustomReader();

        boolean cont = true;
        while (cont) {
            int number = cr.nextInt();
            if (number == 0) {
                cont = false;
                continue;
            }
            int solved = solve(number);
            if (solved == number) {
                System.out.println("perfect number");
            } else if (number > solved) {
                System.out.println("deficient number");
            } else {
                System.out.println("abundant number");
            }
        }
    }

    private static int solve(int number) {
        int count = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count += i;
            }
        }
        return count;
    }



    private static class CustomReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[0];
        String[] strings = new String[0];
        int stringPoint = 0;
        int intPoint = 0;

        String next() {
            try {
                if (stringPoint == strings.length) {
                    String line = br.readLine();
                    strings = line.split(" ");
                    stringPoint = 0;
                }
                return strings[stringPoint++];
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            try {
                if (intPoint == numbers.length) {
                    String line = br.readLine();
                    String[] strings = line.split(" ");
                    numbers = new int[strings.length];
                    for (int i = 0; i < strings.length; i++) {
                        numbers[i] = Integer.parseInt(strings[i]);
                    }
                    intPoint = 0;
                }
                return numbers[intPoint++];
            } catch (IOException e) {
                e.printStackTrace();
            }
            return -1;
        }
    }
}