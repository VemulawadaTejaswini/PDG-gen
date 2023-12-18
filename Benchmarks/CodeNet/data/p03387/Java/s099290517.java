import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i] < array[j]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        int a = array[0];
        int b = array[1];
        int c = array[2];
        int ans = 0;
        while (true) {
            if (a == b && b == c) {
                System.out.println(ans);
                break;
            } else if (a < b && b < c) {
                a++;
                b++;
                ans++;
            } else if (a < b && b == c) {
                a = a + 2;
                ans++;
            } else if (a == c) {
                b = b + 2;
                ans++;
            } else if (a == b) {
                c = c + 2;
            } else if (b < a && c < a) {
                b++;
                c++;
                ans++;
            }
        }
        
    }
}
