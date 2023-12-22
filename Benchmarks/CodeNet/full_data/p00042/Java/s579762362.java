import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int caseNumber = 0;
        while (true) {
            int w = Integer.parseInt(reader.readLine());
            if (w == 0) {
                break;
            }

            caseNumber++;
            int n = Integer.parseInt(reader.readLine());
            int[][] priceWeightPairs = new int[n][2];
            for (int i = 0; i < n; i++) {
                String[] values = reader.readLine().split(",");
                priceWeightPairs[i] = new int[] { Integer.parseInt(values[0]),
                        Integer.parseInt(values[1]) };
            }
            Arrays.sort(priceWeightPairs, new Comparator<Object>() {

                @Override
                public int compare(Object priceWeightPair1,
                        Object priceWeightPair2) {
                    return ((int[]) priceWeightPair1)[1]
                            - ((int[]) priceWeightPair2)[1];
                }
            });

            int maxPriceSum = 0;
            int minWeightSum = Integer.MAX_VALUE;
            for (int k = 1; k <= n; k++) {
                int[] combination = null;
                while (true) {
                    combination = nextCombination(n, k, combination);
                    if (combination == null) {
                        break;
                    }
                    int priceSum = 0;
                    int weightSum = 0;
                    boolean weightOver = false;
                    for (int i = 0; i < k; i++) {
                        int[] priceWeightPair = priceWeightPairs[combination[i]];
                        priceSum += priceWeightPair[0];
                        weightSum += priceWeightPair[1];
                        if (weightSum > w) {
                            weightOver = true;
                            break;
                        }
                    }
                    if (weightOver) {
                        break;
                    }
                    if (priceSum > maxPriceSum) {
                        maxPriceSum = priceSum;
                        minWeightSum = weightSum;
                    } else if (priceSum == maxPriceSum
                            && weightSum < minWeightSum) {
                        minWeightSum = weightSum;
                    }
                }
            }
            out.println("Case " + caseNumber + ":");
            out.println(maxPriceSum);
            out.println(minWeightSum);
        }
    }

    static int[] nextCombination(int n, int k, int[] combination) {
        if (combination == null) {
            combination = new int[k];
            for (int i = 0; i < k; i++) {
                combination[i] = i;
            }
            return combination;
        }
        combination[k - 1]++;
        int carry = k;
        for (int i = k - 1; i >= 1; i--) {
            if (combination[i] <= n - k + i) {
                break;
            }
            combination[i - 1]++;
            carry = i;
        }
        for (int i = carry; i < k; i++) {
            combination[i] = combination[i - 1] + 1;
        }
        if (combination[0] > n - k) {
            return null;
        }
        return combination;
    }
}