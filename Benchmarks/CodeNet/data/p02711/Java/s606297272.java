import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 文字列切り出し
        char c[] = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
            if('7' == c[i]) {
                System.out.println("Yes");
                return;
            }
        }
        
        System.out.println("No");
    }
}
