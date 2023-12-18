import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        S = S.substring(0,K-1)+S.substring(K-1,K).toLowerCase()+S.substring(K);
        System.out.println(S);
        }
}

