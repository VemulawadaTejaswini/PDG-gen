import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    private static int num;
    private static int[] data;

    public static void main(String[] args) {
        dataSet();

        int min = arrayMin(data);
        int max = arrayMax(data);
        int sum = arraySum(data);

        System.out.println(min + " " + max + " " + sum);
    }

    static void dataSet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String numString = reader.readLine();
            String[] dataString = reader.readLine().split(" ");

            num = Integer.parseInt(numString);

            data = new int[num];
            for (int i = 0; i < num; i++) {
                data[i] = Integer.parseInt(dataString[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static int arrayMin(int[] data) {
        int min = -1;
        for (int i = 0; i < data.length; i++) {
            min = Math.min(min, data[i]);
        }
        return min;
    }

    static int arrayMax(int[] data) {
        int max = -1;
        for (int i = 0; i < data.length; i++) {
            max = Math.max(max, data[i]);
        }
        return max;
    }

    static int arraySum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
}