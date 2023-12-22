import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nextInt(scanner);
        int k = nextInt(scanner);
        boolean[] isUsed = new boolean[n];
        int[] p = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = nextInt(scanner) - 1;
        }
        for (int i = 0; i < n; i++) {
            c[i] = nextInt(scanner);
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (!isUsed[i]) {
                int position = i;
                ArrayList<Integer> graph = new ArrayList<>();
                while (p[position] != i) {
                    graph.add(position);
                    isUsed[position] = true;
                    position = p[position];
                }
                isUsed[position] = true;
                graph.add(position);
                int size = graph.size();
                long[] graphValue = graph.stream().mapToLong(x -> c[x]).toArray();
                long sum = 0;
                if (size < k) {
                    long aLoopSum = 0L;
                    for (long value : graphValue) {
                        aLoopSum += value;
                    }
                    if (aLoopSum > 0) {
                        long maxPartialSum = Long.MIN_VALUE;
                        sum += aLoopSum * (k /size);
                        int mod = k % size;
                        for (int j = 0; j < size; j++) {
                             long partialSum = 0;
                            for (int l = 0; l < mod; l++) {
                                partialSum += graphValue[(j + l) % size];
                                maxPartialSum = Math.max(partialSum, maxPartialSum);
                            }
                        }
                        sum += maxPartialSum;
                    } else {
                        for (int j = 0; j < size; j++) {
                            long candidateSum = 0;
                            for (int l = 0; l < size; l++) {
                                candidateSum += graphValue[(j + l) % size];
                                sum = Math.max(sum, candidateSum);
                            }
                        }
                    }
                } else {
                    sum = Long.MIN_VALUE;
                    for (int j = 0; j < size; j++) {
                        long candidateSum = 0;
                        for (int l = 0; l < size; l++) {
                            candidateSum += graphValue[(j + l) % size];
                            sum = Math.max(sum, candidateSum);
                        }
                    }
                }
                max = Math.max(max, sum);
            }
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







