import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int dx = Math.abs(x1-x2);
        int dy = Math.abs(y1-y2);

        if (x1 > x2){
            if (y1 > y2) {
                System.out.println((x2 + dy) + " " + (y2 - dx) + " " + (x1 + dy) + " " + (y1 - dx));
            }else {
                System.out.println((x2 - dy) + " " + (y2 - dx) + " " + (x1 - dy) + " " + (y1 - dx));
            }
        }else {
            if (y1 > y2){
                System.out.println((x2 + dy) + " " + (y2 + dx) + " " + (x1 + dy) + " " + (y1 + dx));
            }else {
                System.out.println((x2 - dy) + " " + (y2 + dx) + " " + (x1 - dy) + " " + (y1 + dx));
            }
        }


    }
}