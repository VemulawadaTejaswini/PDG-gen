import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int i=0,j=0;
            int H = sc.nextInt();
            int W= sc.nextInt();
            if (H == 0 && W == 0) {
                break;
            }
            for(i=0;i<H;i++){
                int b = i%2;
                if(b == 1) {
                    for (j = 0; j < W; j++) {
                        int a = j % 2;
                        if (a == 1)
                            System.out.printf("#");
                        else {
                            System.out.printf(".");
                        }
                    }
                }
                else {
                    for (j = 0; j < W; j++) {
                        int a = j % 2;
                        if (a == 1)
                            System.out.printf(".");
                        else {
                            System.out.printf("#");
                        }
                    }

                }
                System.out.printf("\n");
                }
            System.out.printf("\n");
            }
        }
    }