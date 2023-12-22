
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alphabets = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};

        int N = scanner.nextInt();

        N -= 1;

        List<Integer> list = new ArrayList<>();
        while (N > 0) {
            list.add(N % 26);
            N = N / 26 - 1;
        }

        int length = list.size();
        for (int i = length - 1 ; i >= 0 ; i--) {
            System.out.print(alphabets[list.get(i)]);
        }

        System.out.println();

    }
}
