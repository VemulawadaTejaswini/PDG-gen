import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (int i = 2; i < S.length(); i= i + 2) {
            String sub = S.substring(0,S.length() - i);
            if(isSS( sub )){
                System.out.println(sub.length());
                break;
            }
        }

    }
    private static boolean isSS(String str){

        String pre = str.substring(0, str.length() / 2);
        String post = str.substring(str.length() / 2 , str.length());

        boolean result = true;
        for (int i = 0; i < pre.length(); i++) {
            if (pre.charAt(i) != post.charAt(i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
