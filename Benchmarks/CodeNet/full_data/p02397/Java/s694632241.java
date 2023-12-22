import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
        int[] data = {x, y};

        while(true) {
            if(x == 0 && y == 0)
                break;
            if(x < y) {
                System.out.println(data[0] + " " + data[1]);
            } else {
                System.out.println(data[1] + " " + data[0]);
            }
        }
    }
}