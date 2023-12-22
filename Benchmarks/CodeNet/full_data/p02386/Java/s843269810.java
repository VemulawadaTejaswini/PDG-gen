import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
 
        Dice[] dices = new Dice[num];
        boolean flag = true;
 
        loop: for (int i = 0; i < num; i++) {
            dices[i] = new Dice(scanner.nextLine());
            for (int j = 0; j < i; j++) {
                /*System.out.println(Arrays.toString(dices[i].a) + " -> "
                        + Arrays.toString(dices[j].a));*/
                if (dices[i].equals(dices[j])) {
                    flag = false;
                    break loop;
                }
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}
 
class Dice {
    int[] a = new int[6];
 
    Dice(String s) {
        String[] b = s.split(" ");
        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(b[i]);
        }
    }
 
    public void roll(char c) {
        int temp;
        switch (c) {
        case 'E':
            temp = a[0];
            a[0] = a[3];
            a[3] = a[5];
            a[5] = a[2];
            a[2] = temp;
            break;
        case 'N':
            temp = a[0];
            a[0] = a[1];
            a[1] = a[5];
            a[5] = a[4];
            a[4] = temp;
            break;
        case 'W':
            temp = a[0];
            a[0] = a[2];
            a[2] = a[5];
            a[5] = a[3];
            a[3] = temp;
            break;
        default:
            temp = a[0];
            a[0] = a[4];
            a[4] = a[5];
            a[5] = a[1];
            a[1] = temp;
            break;
        }
    }
 
    public boolean equals(Dice d) {
        char[] c = { 'E', 'E', 'E', 'N', 'W', 'W', 'W', 'S' };
        boolean flag = false;
        loop: for (int i = 0; i < 24; i++) {
            /*System.out.println(Arrays.toString(a) + "========"
                    + Arrays.toString(d.a));*/
            if (Arrays.equals(a, d.a)) {
                flag = true;
                break loop;
            }
            d.roll(c[i % 8]);
        }
        return flag;
    }
}
