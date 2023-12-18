import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        System.out.println(s.replace("2017", "2018"));
    }
}
