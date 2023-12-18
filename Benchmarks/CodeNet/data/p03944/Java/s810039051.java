import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int x;
        int y;
        int a;
        int minX = 0;
        int maxX = w;
        int minY = 0;
        int maxY = h;
        
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();
            switch (a) {
                case 1:
                    if (minX < x) {
                        minX = x;
                    }
                    break;
                case 2:
                    if (maxX > x) {
                        maxX = x;
                    }
                    break;
                case 3:
                    if (minY < y) {
                        minY = y;
                    }
                    break;
                case 4:
                    if (maxY > y) {
                        maxY = y;
                    }
                    break;
                default:
                    break;
            }
        }
        if ((maxX - minX) < 0 || (maxY - minY) < 0) {
            System.out.println(0);
        }
        int answer = (maxX - minX) * (maxY - minY);
        if (answer > 0) {
            System.out.println(answer);
        } else {
            System.out.println(0);
        }
    }
}