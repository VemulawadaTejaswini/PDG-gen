
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String t = input.nextLine();
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();
        int b = input1.nextInt();
        String u = input.nextLine();
        if(s == u)  --b;
        else    --a;
        System.out.print(a + " " + b);
    }
}