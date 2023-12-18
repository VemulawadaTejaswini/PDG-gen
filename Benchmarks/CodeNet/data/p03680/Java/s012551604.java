import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                numbers.add(Integer.parseInt(br.readLine()));
            }

            List<Integer> numberGetMin = new ArrayList<>(numbers);
            sortNatualOrder(numberGetMin);
            int startButton = 0;
            int index = 0;
            
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == numberGetMin.get(0)) {
                    startButton = numbers.get(i);
                    index = i;
                    break;
                }
            }

            boolean startButtonIsTwo = false;
            if (startButton == 2) {
                startButtonIsTwo = true;
            }

            int ans = 0;
            while (true) {
                if (numbers.get(index) == 2 && !startButtonIsTwo) {
                    break;
                } else {
                    startButtonIsTwo = false;
                    index = numbers.get(index) - 1;
                    ans++;
                }

                if (ans > N) {
                    ans = -1;
                    break;
                }
            }

            System.out.println(ans);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static void sortNatualOrder(List<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = intList.size() - 1; j > i; j--) {
                if (intList.get(j - 1) > intList.get(j)) {
                    int tmp = intList.get(j - 1);
                    intList.set(j - 1, intList.get(j));
                    intList.set(j, tmp);
                }
            }
        }
    }
}