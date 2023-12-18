import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        System.out.println(H*W-h*W-w*H+h*w);
        sc.close();
    }
    
}