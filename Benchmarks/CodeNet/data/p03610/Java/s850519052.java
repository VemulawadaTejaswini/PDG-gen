import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer oddStr = new StringBuffer();

        for (int i = 0; i < s.length(); i+=2) {
            oddStr.append(s.charAt(i));
        }
        System.out.println(oddStr.toString());
    }
}