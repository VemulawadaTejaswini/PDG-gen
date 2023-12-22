import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();

        for (int i=0; i<h; i++) {
            if (h==0 || w ==0) break;
            for (int j=0; i<w; j++) {
                 System.out.print("#");
            }
            System.out.println("");
       }
    }
}