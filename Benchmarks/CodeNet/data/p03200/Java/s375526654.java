import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int count = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'W') {
                total += i - count;
                count++;
            }
        }
       System.out.println(total);
    }
}
