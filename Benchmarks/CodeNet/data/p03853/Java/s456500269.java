import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int N = Integer.parseInt(scan.next());
        int H = Integer.parseInt(scan.next());
        int W = Integer.parseInt(scan.next());
        String[] C = new String[H];
        for(int i = 0;i<H;i++){
            C[i] = scan.next();
        }
        for(int i = 0;i<H;i++){
            System.out.println(C[i]);
            System.out.println(C[i]);
        }
    }
}