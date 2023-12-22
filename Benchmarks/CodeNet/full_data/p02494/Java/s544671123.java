import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        int h,w;
        h=input.nextInt();
        w=input.nextInt();
        while (h!=0 || w!=0) {
            for (int i=0; i<h; i++) {
                for (int j=0; j<w; j++) {
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
            input=new Scanner(System.in);
            h=input.nextInt();
            w=input.nextInt();
        }
    }
}