import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
