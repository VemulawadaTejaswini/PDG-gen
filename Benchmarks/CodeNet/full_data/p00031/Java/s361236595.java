import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int weight = Integer.parseInt(sc.next());

            boolean flag = false;
            for (int i = 1; i <= 512; i <<= 1) {
                if ((weight & i) == i) {
                    if (!flag) {
                        flag = true;
                    } else {
                        System.out.printf(" ");
                    }
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}