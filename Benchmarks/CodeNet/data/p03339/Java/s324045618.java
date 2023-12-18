import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        char[] array = S.toCharArray();

        int current = 0;
        for (int i = 1; i < N; ++i) {
            if (array[i] == 'E') {
                ++current;
            }
        }

        int min = current;
        for (int i = 1; i < N; ++i) {
            //current += line[i];
            if (array[i] == 'E') {
                --current;
            }
            if (array[i-1] == 'W') {
                ++current;
            }
            if (min > current) {
                min = current;
            }
        }

        System.out.println(min);
    }
}