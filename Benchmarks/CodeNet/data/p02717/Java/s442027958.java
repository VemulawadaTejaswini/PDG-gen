import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
 
        String a = s.next();
        String b = s.next();
        String c = s.next();
        String tempStr = "";
 
        tempStr = a;
        a = b;
        b = tempStr;
        tempStr = a;
        a = c;
        c = tempStr;
        System.out.println(a + " " + b + " " + c);
    }
}