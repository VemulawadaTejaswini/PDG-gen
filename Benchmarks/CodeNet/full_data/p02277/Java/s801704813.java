import java.io.IOException;
import java.util.Scanner;

class Main {

    static boolean stable = true;
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[][] cards = new char[n][3];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextLine().toCharArray();
        }

        quickSort(cards, 0, n - 1);

        StringBuilder sb = new StringBuilder("");
        if (stable) sb.append("Stable\n");
        else sb.append("Not stable\n");

        for (int i = 0; i < n; i++) {
            sb.append(cards[i][0]).append(" ").append(cards[i][2]).append("\n");
        }
        System.out.print(sb);

    }

    public static int partition(char[][] arr, int left, int right) {
        int x = arr[right][2];
        int i = left;
        char[] temp;
        for (int j = left; j < right; j++) {
            if (arr[j][2] <= x) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                stable &= !cointainsBetween(arr, arr[j][2], i, j);
                i++;
            }
        }
        temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }

    public static void quickSort(char[][] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static boolean cointainsBetween(char[][] arr, int target, int left, int right) {
        for (int i = left; i < right; i++) {
            if (arr[i][2] == target) {
                return true;
            }
        }
        return false;
    }
}