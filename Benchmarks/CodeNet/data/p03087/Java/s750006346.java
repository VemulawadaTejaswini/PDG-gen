import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int textLength = sc.nextInt();
        int questions = sc.nextInt();
        char[] text = sc.next().toCharArray();
        int[] acPos = findACPositions(text);

        for (int i = 0; i < questions; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 2;

            int rangeStart = Arrays.binarySearch(acPos, start);
            rangeStart = rangeStart >= 0 ? rangeStart : Math.abs(rangeStart);
            if (rangeStart >= acPos.length) {
                System.out.println(0);
            }

            int rangeEnd = Arrays.binarySearch(acPos, end);
            if (rangeEnd >= 0) {
                if (rangeEnd == acPos.length) {
                    rangeEnd--;
                }
            } else {
                rangeEnd = Math.abs(rangeEnd + 1);
                if (rangeEnd == acPos.length || acPos[rangeEnd] >= end) {
                    rangeEnd--;
                }
            }

            int count = rangeEnd - rangeStart + 1;

            System.out.println(count > 0 ? count : 0);
        }
    }

    private static int[] findACPositions(char[] text) {
        IntStream.Builder result = IntStream.builder();
        for (int i = 0; i < text.length - 1; i++) {
            if (text[i] == 'A' && text[i + 1] == 'C') {
                result.accept(i);
                i++;
            }
        }
        return result.build().toArray();
    }
}