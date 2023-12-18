import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author nakker
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        ArrayList<Float> input = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            input.add(scanner.nextFloat());
        }

        ArrayList<Float> sortedList = new ArrayList(insertionSort(input));
        float result = calculate(sortedList.get(sortedList.size() - 1), sortedList.get(sortedList.size() - 2));

        sortedList.remove(sortedList.size() - 1);
        sortedList.remove(sortedList.size() - 1);

        int i = sortedList.size() - 1;
        while (sortedList.size() > 0) {
            result = calculate(result, sortedList.get(i));
            sortedList.remove(i);

            i--;
        }

        System.out.println(result);
    }

    private static float calculate(float a, float b) {
        return (a + b) / 2;
    }

    private static List<Float> insertionSort(List<Float> list) {
        ArrayList<Float> result = new ArrayList<>(list);

        for (int i = 1; i < result.size(); i++) {
            float check = result.get(i);

            int j = i;
            int num = j;
            while (j > 0) {
                if (result.get(j) > check) {
                    num = j;
                }
                j--;
            }

            result.remove(i);
            result.add(num, check);
        }

        return result;
    }
}
