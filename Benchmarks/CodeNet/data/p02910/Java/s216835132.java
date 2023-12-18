import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean result = true;
        for(int i = 0;i < s.length();i++){
            if((i % 2 == 0 && s.charAt(i) == 'L') || (i % 2 == 1 && s.charAt(i) == 'R')){
                result = false;
                break;
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}