import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

class Main {
    static int[] label = new int[6];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ans = false;
        int[] label2 = new int[6];

        for (int i = 0; i < 6; i++)
            label[i] = sc.nextInt();
        for (int i = 0; i < 6; i++)
            label2[i] = sc.nextInt();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (Arrays.equals(label2, label)) {
                    ans = true;
                    break;
                }
                dice1('X');
            }
            if (Arrays.equals(label2, label)) {
                ans = true;
                break;
            }
            dice1('N');
            if (i >= 2)
                dice1('N');
            if (i >= 3)
                dice1('N');
        }
        if (ans) {
            System.out.println("Yes");
        }  else {
            System.out.println("No");
        }    
    }

    public static void dice1(char c) {
        int temp;
        switch (c) {
        case 'N':
            temp = label[0];
            label[0] = label[1];
            label[1] = label[5];
            label[5] = label[4];
            label[4] = temp;
            break;
        default :
            temp = label[1];
            label[1] = label[2];
            label[2] = label[4];
            label[4] = label[3];
            label[3] = temp;
            break;
        }
    }
}
