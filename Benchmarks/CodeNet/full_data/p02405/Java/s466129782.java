import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int w = scn.nextInt();

        while ((h != 0) || (w != 0)) {
            for (int i = 0; i < h; i++) {

                if ((i % 2) == 0) {
                    for (int j = 0; j < w; j++) {
                        if ((j % 2) == 0) {
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }

                    }

                } else {
                    for (int j = 0; j < w; j++) {
                        if ((j % 2) == 1) {
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }

                    }
                }


                System.out.println("");
            }
            System.out.println("");
            h = scn.nextInt();
            w = scn.nextInt();


        }

        scn.close();


    }
}

