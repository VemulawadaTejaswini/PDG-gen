import java.util.Scanner;

class Main {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pivot = partition(arr, 0, n-1);

        StringBuilder sb = new StringBuilder("");
        sb.append(arr[0]);
        for (int i = 1; i < n; i++) {
            sb.append(" ");
            if (i == pivot) {
                sb.append("[").append(arr[i]).append("]");
            } else {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }

    public static int partition(int[] arr, int left, int right) {
        int x = arr[right];
        int i = left - 1;
        int temp;
        for (int j = left; j <= right - 1; j++) {
            if (arr[j] <= x) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }
}