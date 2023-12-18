import java.util.Scanner;

class Frog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(minCost(arr, 0, 0));

    }

    public static int minCost(int arr[], int cost, int index) {
        if (index >= arr.length - 1) {
            return cost;
        }

        int cost1 = Integer.MAX_VALUE;
        if (index + 1 < arr.length) {
            cost1 = minCost(arr, Math.abs(arr[index + 1] - arr[index]), index + 1);

        }
        int cost2 = Integer.MAX_VALUE;
        if (index + 2 < arr.length) {
            cost2 = minCost(arr, Math.abs(arr[index + 2] - arr[index]), index + 2);

        }

        return Math.min(cost1, cost2);
    }

}