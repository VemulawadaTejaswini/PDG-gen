import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String[] number = scan.nextLine().split(" ");
        double x1 = Double.parseDouble(number[0]);
        double x2 = Double.parseDouble(number[2]);
        double y1 = Double.parseDouble(number[1]);
        double y2 = Double.parseDouble(number[3]);
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println(distance);
    }
}