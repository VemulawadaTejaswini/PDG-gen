import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long a = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+4; j < s.length()+1; j++) {
                a = Long.parseLong(s.substring(i, j));
                if (a % 2019 == 0) count++;
            }
        }
        System.out.println(count);

    }
}
