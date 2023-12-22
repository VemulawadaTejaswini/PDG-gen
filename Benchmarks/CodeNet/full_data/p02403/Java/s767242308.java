
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            int h = scan.nextInt();
            int w = scan.nextInt();
            if (h==0 && w ==0) break;
            scan.nextLine();
            for (int i=0; i<h; i++) {
                for (int j=0; i<w; j++) {
                    System.out.print("#");
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }
}