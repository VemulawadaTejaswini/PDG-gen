import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String right = "";
        String left = "";
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (n % 2 == 0) {
                if(i % 2 == 0) {
                    right += num + " ";
                } else {
                    left = num + " " + left;
                }
            } else {
                if(i % 2 == 0) {
                    left = num + " " + left;
                } else {
                    right += num + " ";
                }
            }
        }
        System.out.println(left + right);
    }
}