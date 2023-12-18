import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        char c;
        Scanner in=new Scanner(System.in);
        c=in.next().charAt(0);
        c++;
        System.out.println("The input is "+c);
    }
}