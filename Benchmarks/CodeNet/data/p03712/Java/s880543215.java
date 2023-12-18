import java.util.Scanner;

public final class Main {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int h = s.nextInt();
                int w = s.nextInt();

                String[] img = new String[h];

                for (int i=0; i<h; i++) {
                        img[i] = s.next();
                }

                // print top border
                for (int i=0; i<w+2; i++)
                        System.out.print("#");
                System.out.println();

                //print main section
                for (int i=0; i<h; i++)
                        System.out.println("#"+img[i]+"#");

                for (int i=0; i<w+2; i++)
                        System.out.print("#");
                System.out.println();

        }       
}
