import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String[] number = scan.nextLine().split(" ");
        int x1 = Integer.parseInt(number[0]);
        int x2 = Integer.parseInt(number[2]);
        int y1 = Integer.parseInt(number[1]);
        int y2 = Integer.parseInt(number[3]);
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println(distance);
    }
}