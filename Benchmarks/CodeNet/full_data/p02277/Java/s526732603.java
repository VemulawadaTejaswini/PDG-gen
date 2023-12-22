import java.io.IOException;
import java.util.Scanner;

class Main {

    static boolean stable = true;
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[][] cards = new String[n][];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextLine().split(" ");
        }

        quickSort(cards, 0, n - 1);

        StringBuilder sb = new StringBuilder("");
        if (stable) sb.append("Stable\n");
        else sb.append("Not stable\n");

        for (int i = 0; i < n; i++) {
            sb.append(cards[i][0]).append(" ").append(cards[i][1]).append("\n");
        }
        System.out.print(sb);

    }

    public static int partition(String[][] arr, int left, int right) {
        int x = Integer.parseInt(arr[right][1]);
        int i = left;
        String[] temp;
        for (int j = left; j < right; j++) {
            if (Integer.parseInt(arr[j][1]) <= x) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                stable &= !cointainsBetween(arr, Integer.parseInt(arr[j][1]), i, j);
                i++;
            }
        }
        temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }

    public static void quickSort(String[][] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static boolean cointainsBetween(String[][] arr, int target, int left, int right) {
        for (int i = left; i < right; i++) {
            if (Integer.parseInt(arr[i][1]) == target) {
                return true;
            }
        }
        return false;
    }
}