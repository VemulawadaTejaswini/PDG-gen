import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x1 = Integer.parseInt(sc.next());
        int y1 = Integer.parseInt(sc.next());
        int x2 = Integer.parseInt(sc.next());
        int y2 = Integer.parseInt(sc.next());
        
        int x3 = x2 + y1 - y2;
        int y3 = y2 + x2 - x1;
        int x4 = x1 + y1 - y2;
        int y4 = y1 + x2 - x1;
        
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}