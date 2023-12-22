import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = isTrue(s)%9 == 0? "Yes":"No";
        System.out.println(result);
    }
    public static int isTrue(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i)-'0';
        }
        return count;
    }
}