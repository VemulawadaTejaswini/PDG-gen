import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        arr[0] = arr[0] == '0' ? '1' : '0';
        System.out.println(Math.min(painted(arr, 1), painted(s.toCharArray(), 0)));
    }

    private static int painted(char[] arr, int count) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
                arr[i] = arr[i] == '0' ? '1' : '0';
            }
        }
        return count;
    }
}