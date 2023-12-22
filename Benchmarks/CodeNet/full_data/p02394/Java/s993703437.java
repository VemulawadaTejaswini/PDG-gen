import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] arrData = line.split(" ");
        int W = Integer.valueOf(arrData[0]);
        int H = Integer.valueOf(arrData[1]);
        int x = Integer.valueOf(arrData[2]);
        int y = Integer.valueOf(arrData[3]);
        int r = Integer.valueOf(arrData[4]);

        if(x + r > W) {
            System.out.println("No");
            return;
        }

        if (y + r > H) {
            System.out.println("No");
            return;
        }

        if(x - r < 0) {
            System.out.println("No");
            return;
        }

        if (y - r < 0) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
}
}
