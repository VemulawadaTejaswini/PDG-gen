import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        long a = sc.nextLong(), b = sc.nextLong(), x = sc.nextLong();
                        System.out.println(b / x - (a - 1) / x);
                }
        }
}