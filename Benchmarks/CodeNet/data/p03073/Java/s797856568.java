import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String ab = "01";
        String s1 = new String();
        boolean judge = s.length() % 2 == 0;

        s1 = "1";
        if (!judge) s1 = "0";

        for (int i = 1; i < s.length(); i++) {
            if(s1.charAt(s1.length()-1) == ab.charAt(0)){
                s1 += "1";
            }else if(s1.charAt(s1.length()-1) == ab.charAt(1)) {
                s1 += "0";
            }
        }

        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s1.charAt(i)) count++;
        }

        System.out.println(count);
    }

}
