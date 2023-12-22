import java.util.Scanner;
import java.util.Arrays;

class Main {
    static int[] label = new int[6];
    static int[][] label2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean ans = true;

        n = sc.nextInt();
        label2 = new int[n][6];
        for (int i = 0; i < 6; i++)
            label[i] = sc.nextInt();
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < 6; i++) 
                label2[j][i] = sc.nextInt();
            if (dice3(j)) {
                ans = false;
                break;
            }
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

    public static boolean dice3(int k) {
        boolean ans = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (Arrays.equals(label2[k], label)) {
                    ans = true;
                    break;
                }
                dice1('X');
            }
            if (Arrays.equals(label2[k], label)) {
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
            return true;
        }  else {
            return false;
        } 
    }
}
