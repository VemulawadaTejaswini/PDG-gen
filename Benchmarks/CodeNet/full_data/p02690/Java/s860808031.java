import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 0;
        int b = 0;
        int i = 0;

        boolean flag = true;
        while (flag) {
            for (int j = 0; j <= i; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
                    a = i;
                    b = j;
                    flag = false;
                    break;
                }
                if (Math.pow(i, 5) - Math.pow(j * -1, 5) == x) {
                    a = i;
                    b = j * -1;
                    flag = false;
                    break;
                }
            }
            i++;
        }
        
        System.out.println(a + " " + b);
    }
}
