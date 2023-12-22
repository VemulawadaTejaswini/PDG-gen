import java.io.*;

class Main {
    private static int num;
    private static int[] data;

    public static void main(String[] args) {
        dataSet();

        long min = arrayMin(data);
        long max = arrayMax(data);
        long sum = arraySum(data);

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

    static long arrayMin(int[] data) {
        long min = Long.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            min = Math.min(min, data[i]);
        }
        return min;
    }

    static long arrayMax(int[] data) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            max = Math.max(max, data[i]);
        }
        return max;
    }

    static long arraySum(int[] data) {
        long sum = 0;
        for (int i = 0; i < num; i++) {
            sum += data[i];
        }
        return sum;
    }
}