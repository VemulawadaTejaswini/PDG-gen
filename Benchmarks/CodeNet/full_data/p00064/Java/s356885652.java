import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            String[] str = sc.next().split("[^0-9]");
            for (int i = 0; i < str.length; i++) {
                if (str[i].length() > 0) {
                    sum += Integer.parseInt(str[i]);
                }
            }
        }
        System.out.println(sum);
    }
}
