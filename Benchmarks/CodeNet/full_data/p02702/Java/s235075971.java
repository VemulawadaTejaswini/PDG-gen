import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        
        long cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+3; j < s.length(); j++) {
                if(Long.parseLong(s.substring(i,j))%2019 == 0) cnt++;
            }
        }
        System.out.println(cnt);
    }
}