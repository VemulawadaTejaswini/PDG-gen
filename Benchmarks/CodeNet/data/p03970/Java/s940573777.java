import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replace("\n", "");
        sc.close();

        int count = 0;
        String sign = "CODEFESTIVAL2016";
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sign.charAt(i)) count++;
        }

        System.out.println(count);
    }
}
