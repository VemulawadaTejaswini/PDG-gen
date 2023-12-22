import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void selectSort(int[] data, int n) {
        int count = 0, minInx, tmp;

        for (int i = 0; i < n; i++) {
            minInx = i;
            for (int j = i; j < n; j++) {
                if (data[j] < data[minInx]) {
                    minInx = j;
                }
            }
            if (minInx != i) {
                tmp = data[i];
                data[i] = data[minInx];
                data[minInx] = tmp;
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.printf("%d", data[i]);
        }
        System.out.print("\n");
        System.out.println(count);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            int nums[] = new int[n];
            String[] input_string = br.readLine().split(" ");

            for (int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(input_string[i]);

            selectSort(nums, n);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
