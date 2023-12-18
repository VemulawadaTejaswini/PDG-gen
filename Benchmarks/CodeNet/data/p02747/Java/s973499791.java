import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        if((S.length() % 2) != 0) {
            System.out.println("NO");
        }
        for(int i = 0; i*2 < S.length(); i++) {
            String a = S.substring(i*2, (i*2)+2);
            if(!a.equals("hi")) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}