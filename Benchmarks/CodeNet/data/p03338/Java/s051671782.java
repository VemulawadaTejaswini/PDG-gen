import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String[] array = scanner.nextLine().split(" ");
        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        char[] array = S.toCharArray();
        int[] line = new int[N];

        for (int i = 0; i < N; ++i) {
            char start = array[i];
            if (start != '\n') {
                int endIndex = i;
                array[i] = '\n';
                for (int j = i + 1; j < N; ++j) {
                    if (array[j] == start) {
                        array[j] = '\n';
                        endIndex = j;
                    }
                }
                if (i != endIndex) {
                    line[i] = 1;
                    line[endIndex] = -1;
                }
            }
        }

        int max = 0;
        int current = 0;
        for (int i = 0; i < N; ++i) {
            current += line[i];
            if (max < current) {
                max = current;
            }
        }

        System.out.println(max);
    }
}