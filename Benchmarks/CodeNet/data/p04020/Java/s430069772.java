import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int count = 0;
            boolean left=false;
            while (i-- > 0) {
                int x = sc.nextInt();
                count += x / 2;
                if (left == true && x % 2 == 1) {
                    count++;
                    left=false;
                } else if (left == false && x % 2 == 1) {
                    left=true;
                } else if (left == true && x % 2 == 0) {
                    left=false;
                }

            }
            System.out.println(count);
        }
    }
}