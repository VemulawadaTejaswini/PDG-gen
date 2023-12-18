import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(" "));
            long A = Long.parseLong(inputString.get(0));
            long B = Long.parseLong(inputString.get(1));
            long N = Long.parseLong(inputString.get(2));

            List<Long> ansList = new ArrayList<>();
            for (long i = N; i >= 0; i--) {
                ansList.add((long)(Math.floor((A * i) / B) - (A * Math.floor(i / B))));
            }

            sortNatualOrder(ansList);
            long ans = ansList.get(ansList.size() - 1);
            System.out.println(ans);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static void sortNatualOrder(List<Long> targetList) {
        for (int i = 0; i < targetList.size() - 1; i++) {
            for (int j = targetList.size() - 1; j > i ; j--) {
                if (targetList.get(j - 1) > targetList.get(j)) {
                    Long tmp = targetList.get(j - 1);
                    targetList.set(j - 1, targetList.get(j));
                    targetList.set(j, tmp);
                }
            }
        }
    }
}