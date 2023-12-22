import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (w == 0 && h == 0) break;
            if(w==1&&h==1) System.out.println("#");
            else {
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (i % 2 != 0) {
                            if(j%2!=0)System.out.printf(".");
                            else System.out.printf("#");
                        }
                        else {
                            if(j%2!=0)System.out.printf("#");
                            else System.out.printf(".");

                        }
                    }
                    System.out.printf("\n");
                }
            }
                System.out.printf("\n");

        }
    }
}
