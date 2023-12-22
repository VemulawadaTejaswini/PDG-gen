import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dice dice = new Dice();
        for (int i = 0; i < 6; i++) {
            dice.generateDice(i, scan.nextInt());
        }
        dice.roll(scan.next());
        System.out.println(dice.getTop(1));
    }
}

class Dice {
    private int[] num = new int[6];
    void generateDice(int count, int n) {
        num[count] = n;
    }

    void roll(String direction) {
        for (int i = 0; i < direction.length(); i++) {
            int top = num[0];
            switch (direction.charAt(i)) {
                case 'N':
                    num[0] = num[1];
                    num[1] = num[5];
                    num[5] = num[4];
                    num[4] = top;
                    break;
                case 'S':
                    num[0] = num[4];
                    num[4] = num[5];
                    num[5] = num[1];
                    num[1] = top;
                    break;
                case 'W':
                    num[0] = num[2];
                    num[2] = num[5];
                    num[5] = num[3];
                    num[3] = top;
                    break;
                case 'E':
                    num[0] = num[3];
                    num[3] = num[5];
                    num[5] = num[2];
                    num[2] = top;
                    break;
            }
        }
    }

    int getTop(int i) {
        return num[i -1];
    }
}