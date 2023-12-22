import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int h, m, s;
        h = time/3600;
        m = time%3600/60;
        s = time%3600%60;
        System.out.printf("%d : %d : %d", h, m, s);
        scan.close();
    }
}
