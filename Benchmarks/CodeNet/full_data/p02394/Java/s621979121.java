import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        
        if (in(x - r, 0, w) && in(x + r, 0, w) && in(y - r, 0, h) && in(y + r, 0, h)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static boolean in(int value, int min, int max) {
        return value >= min && value <= max;
    }
}