import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        
        char ans = '1';
        for(char str : s) {
            if(str != '1') {
                ans = str;
                break;
            }
        }
        
        System.out.println(ans);
    }
}
