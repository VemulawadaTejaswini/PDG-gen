import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            // H height,W weight
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 && W == 0) {break;}

            for (int i = 1; i <= H;i++) {
                // 奇数行
                if (i%2 == 1) {
                for (int j = 1; j <= W; j++) {
                    if (j%2 == 1){
                        System.out.print("#");
                    } else if (j%2 == 0) {
                        System.out.print(".");
                    }
                }
                System.out.println();
                // 偶数行
                } else if (i%2 == 0) {
                for (int j = 1; j <= W; j++) {
                    if (j%2 == 1){
                        System.out.print(".");
                    } else if (j%2 == 0) {
                        System.out.print("#");
                    }
                }
                System.out.println();
                }
            }
            System.out.println();

        }
    }
}
