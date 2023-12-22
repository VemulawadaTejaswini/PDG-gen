import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner scan = new java.util.Scanner(System.in);
    int S = scan.nextInt();
    int h, m, s;
    h = S / 3600;
    m = S % 3600;
    m = m / 60;
    s = m % 60;
    System.out.println(h + ":" + m + ":" + s);
    }
}