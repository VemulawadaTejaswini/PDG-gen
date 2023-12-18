import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        String[] c = new String[n];

        int left = 0;
        int right = 0;

        c[0] = str.substring(0, 1);
        for (int i = 1; i < n; i++) {
            String tmp = str.substring(i, i + 1);
            if((Objects.equals(tmp, "E"))){
                right++;
            }
            c[i] = tmp;

        }

        long min = right;
        for (int i = 1; i < n; i++) {
            if(Objects.equals(c[i - 1], "W")) {
                left++;
            }

            if(Objects.equals(c[i], "E")) {
                right--;
            }

            if(left + right < min){
                min = left + right;
            }
        }

        System.out.println(min);
    }
}
