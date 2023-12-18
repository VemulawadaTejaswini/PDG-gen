import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine().trim();
        String c = sc.nextLine().trim();

        if (c.chars().anyMatch(i -> m.indexOf(i) == -1)) {
            System.out.println(-1);
            return;
        }

        long index = 0;
        for (char ch : c.toCharArray()) {
            OptionalInt first;

            final long var = index % m.length();
            first = allIndex(m, ch).filter(i -> i > var).findFirst();


            if (first.isPresent()) {
                index = (index / m.length()) * (m.length()) + first.getAsInt();
                continue;
            }

            index = ((index / m.length()) + 1) * (m.length()) + allIndex(m, ch).findFirst().orElseThrow(IndexOutOfBoundsException::new);
        }
        System.out.println(index + 1);
    }

    private static IntStream allIndex(String m, int c) {
        return IntStream.iterate(m.indexOf(c), i -> m.indexOf(c, i + 1)).filter(i -> i > -1).limit(m.length());
    }
}