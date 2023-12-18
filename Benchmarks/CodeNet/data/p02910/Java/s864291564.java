import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        boolean easy = true;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(
                    (i%2==0&&c=='L')
                    || (i%2==1&&c=='R')
            ) {
                easy = false;
                break;
            }
        }
        System.out.println(easy ? "Yes" : "No");
    }
}
