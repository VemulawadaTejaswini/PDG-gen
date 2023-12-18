import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mot = (int)(n / 1.08);

        String ans = ":(";

        int at = (int)(mot * 1.08);

        if(at == n) {
            ans = String.valueOf(mot);
        }

        System.out.println(ans);
    }
}
