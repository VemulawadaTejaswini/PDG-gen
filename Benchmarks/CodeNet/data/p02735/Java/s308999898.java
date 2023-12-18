import java.util.Scanner;

/*
AGC043A
*/

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int w = s.nextInt();
        int count = 0;
        int temp = 0;
        String row[] = new String[h];

        String all[][] = new String[h][w];

        for (int i = 0; i < h; i++) {
            row[i] = s.next();

            all[i] = row[i].split("");

            for (int j = 0; j < w; j++) {
                if (all[i][j].equals("#")) {
                    temp++;
                }
            }
        }

        if (temp != (h-1)*(w-1)) {
            count = Math.abs(temp - (h-1)*(w-1));
        }

        if (all[0][0].equals("#") || all[h-1][w-1].equals("#")) {
            count++;
        }
//        if (all[h-1][w-1].equals("#")) {
//            count++;
//        }

        System.out.println(count);
    }
}