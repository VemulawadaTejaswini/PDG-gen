import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] cha = str.toCharArray();
        String nickname = String.valueOf(cha[0]) + String.valueOf(cha[1]) + String.valueOf(cha[2]);

        System.out.println(nickname);
        sc.close();
    }
}