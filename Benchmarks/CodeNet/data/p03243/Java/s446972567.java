import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 100;
        String c = Integer.toString(b);
        String d = c + c + c;
        if (a - Integer.parseInt(d) > 0) {
            System.out.println(Integer.parseInt(d) + 111);
        } else {
            System.out.println(d);
        }
    }
}
