import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextLong();
        double y=sc.nextLong();
        System.out.println((int)(Math.log(y/x)/Math.log(2)+1));
    }
}
