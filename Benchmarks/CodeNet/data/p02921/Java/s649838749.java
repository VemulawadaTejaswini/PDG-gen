import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int answer = 0;
        for(int i=0;i< S.length(); i++) {
            if (S.substring(i) == T.substring(i)) {
                answer++;
            }
        }

    }
}
