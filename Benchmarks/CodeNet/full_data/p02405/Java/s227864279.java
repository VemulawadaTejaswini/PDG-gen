import java.util.Scanner;



public class Main {

//    public static void gyo1(int w2, int number){
//        if ( w2 == 1) {
//            for (int a = 0; a < number; a++) {
//                System.out.printf("#.");
//            }
//            System.out.printf("#");
//        } else {
//            for (int a = 0; a < number; a++) {
//                System.out.printf("#.");
//            }
//        }
//        System.out.printf("\n");
//    }
//
//    public static void gyo2(int n, int number){
//        if ( n == 1) {
//            for (int a = 0; a < number ; a++) {
//                System.out.printf(".#");
//            }
//            System.out.printf(".");
//        } else {
//            for (int a = 0; a < number; a++) {
//                System.out.printf(".#");
//            }
//        }
//        System.out.printf("\n");
//    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            int H = input.nextInt();
            int W = input.nextInt();
            if (H == 0 && W == 0) {
                break;
            }
            int w2 = W % 2;
            for (int i = 0; i < H; i = i + 1) {
                if (i % 2 == 0) {
                    if ( w2 == 1) {
                        for (int a = 0; a < W / 2; a++) {
                            System.out.printf("#.");
                        }
                        System.out.printf("#");
                    } else {
                        for (int a = 0; a < W / 2; a++) {
                            System.out.printf("#.");
                        }
                    }
                    System.out.printf("\n");
                    continue;
                }
                if ( w2 == 1) {
                    for (int a = 0; a < W /2 ; a++) {
                        System.out.printf(".#");
                    }
                    System.out.printf(".");
                } else {
                    for (int a = 0; a < W / 2 ; a++) {
                        System.out.printf(".#");
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
            // }
            //第一行目の”＃. # .”

        }
    }

}
