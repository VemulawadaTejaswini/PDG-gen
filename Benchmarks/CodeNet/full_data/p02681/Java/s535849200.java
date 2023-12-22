import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String T = sc.nextLine();

        T = T.replace(T.substring(T.length()-1), "");

        

        if(T.equals(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}