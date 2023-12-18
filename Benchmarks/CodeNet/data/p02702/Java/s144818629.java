import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                long num = Long.valueOf(s.substring(i,j+1));
                if (num % 2019 == 0) {
                    count++;
                    i = j - 1;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
