import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int x = sc.nextInt();
        String a = "";
        a = k * 500 >= x ? "Yes" : "No";

        System.out.println(a);

    }

}
