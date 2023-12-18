import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == 'A' && arr[i + 1] == 'B' && arr[i + 2] == 'C') {
                count++;
            }
        }
        System.out.println(count);
    }
}