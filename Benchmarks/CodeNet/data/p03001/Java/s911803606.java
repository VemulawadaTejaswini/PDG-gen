import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer W = Integer.parseInt(scan.next());
        Integer H = Integer.parseInt(scan.next());
        Integer X = Integer.parseInt(scan.next());
        Integer Y = Integer.parseInt(scan.next());

        double s1 = W * Y;
        double s2 = (W-X) * H;

        int c = 0;
        if(s1 != s2) c = 1;

        System.out.println(s1 + " " + c);
    }
}