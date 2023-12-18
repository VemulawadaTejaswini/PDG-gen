import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var k = Integer.parseInt(scaner.nextLine());
        var a_b = scaner.nextLine().split(" ");
        var a = Integer.parseInt(a_b[0]);
        var b = Integer.parseInt(a_b[1]);
        
        if(a <= k && k <= b) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        scaner.close();

    }
}
