import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sn = s.split("");
        if (sn[0].equals(sn[1]) && sn[1].equals(sn[2])) {
            System.out.println("Yes");
        } else if (sn[1].equals(sn[2]) && sn[2].equals(sn[3])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}