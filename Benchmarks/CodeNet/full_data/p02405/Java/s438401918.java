package src;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int H = sc.nextInt();
        int W = sc.nextInt();

        for (i = 0; i < H; i++) {
            if (H == 0 && W == 0) {
                break;
            }
            if(W%2==0) {
                for (j = 0; j < W / 2; j++) {
                    System.out.print("#.");
                }
                System.out.print("\n");


            }else{
                for (j = 0; j < W / 2; j++) {
                    System.out.print("#.");
                }
                System.out.print("#");
                System.out.print("\n");
            }
        }
    }
}

