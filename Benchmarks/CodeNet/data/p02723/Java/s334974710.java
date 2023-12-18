import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("文字を入力してください。");
        String S = stdIn.next();

        if (S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}