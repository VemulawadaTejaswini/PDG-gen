package JavaBasic;

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int healt = input.nextInt();
        int attack = input.nextInt();
        int manyattacks = 0;
        while (healt >= 0){
            healt = healt - attack;
            manyattacks++;
        }
        System.out.println(manyattacks);
    }
}