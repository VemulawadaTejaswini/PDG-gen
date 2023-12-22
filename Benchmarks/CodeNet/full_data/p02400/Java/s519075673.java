import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double s,o;
        s=r*r*Math.PI;
        o=2*r*Math.PI;

        System.out.println(s+" "+o);
    }
}
