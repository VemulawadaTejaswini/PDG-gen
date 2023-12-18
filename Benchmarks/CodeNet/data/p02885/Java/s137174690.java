import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        int answer = Math.max(0, a - b * 2);

        System.out.println(answer);

        scan.close();

    }

}
