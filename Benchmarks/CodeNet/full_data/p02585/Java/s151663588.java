import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        int k = nextInt(scanner);
        int[] p = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = nextInt(scanner) - 1;
        }
        for (int i = 0; i < n; i++) {
            c[i] = nextInt(scanner);
        }

        long max = Long.MIN_VALUE;
        ArrayList<Integer> scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scores.clear();
            long candidateMax = 0;
            int position = p[i];
            scores.add(c[position]);

            while (position != i) {
                position = p[position];
                scores.add(scores.get(scores.size() - 1) + c[position]);
            }

            if (k <= scores.size()) {
                candidateMax = scores.subList(0, k).stream().mapToLong(x -> x).max().orElseThrow(NoSuchElementException::new);
            } else if (scores.get(scores.size() - 1) <= 0) {
                candidateMax = scores.stream().mapToLong(x -> x).max().orElseThrow(NoSuchElementException::new);
            } else {
                candidateMax = scores.get(scores.size() - 1) * (k / scores.size() - 1);
                candidateMax += scores.stream().mapToLong(x -> x).max().orElseThrow(NoSuchElementException::new);
                int candidateMax2 = scores.get(scores.size() - 1) * (k / scores.size());
                int mod = k % scores.size();
                if (mod != 0) {
                    candidateMax2 += Math.max(0, scores.subList(0, mod).stream().mapToLong(x -> x).max().orElseThrow(NoSuchElementException::new));
                }
                candidateMax = Math.max(candidateMax, candidateMax2);
            }
            max = Math.max(max, candidateMax);
        }
        System.out.println(max);
    }


    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }

    private static long nextLong(Scanner scanner) {
        return Long.parseLong(scanner.next());
    }

    private static float nextFloat(Scanner scanner) {
        return Float.parseFloat(scanner.next());
    }

    private static double nextDouble(Scanner scanner) {
        return Double.parseDouble(scanner.next());
    }


}







