import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; ++i) {
            array[i] = scanner.nextInt();
        }

        if (arraySize == 1) {
            System.out.println("1");
            return;
        }

        int ans = 1;
        String state = (array[0] > array[1]) ? "decreasing" : (array[0] == array[1]) ? "equal" : "increasing";
        for (int i = 2; i < arraySize; ++i) {
            if (state.equals("restart")) {
                state = (array[i - 1] > array[i]) ? "decreasing" : (array[i - 1] == array[i]) ? "equal" : "increasing";
            } else if (array[i - 1] > array[i]) {
                state = (state.equals("increasing")) ? "restart" : "decreasing";
            } else if (array[i - 1] < array[i]) {
                state = (state.equals("decreasing")) ? "restart" : "increasing";
            } else {
                state = "equal";
            }

            ans += (state.equals("restart")) ? 1 : 0;
            // System.out.println("i = " + i + ", state = " + state + ", ans = " + ans);
        }

        System.out.println(ans);

    }
}