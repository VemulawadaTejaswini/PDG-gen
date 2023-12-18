import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        char[] s = S.toCharArray();

        long ret=0;
        long b = 0;

        for(int i=0;i<s.length;i++) {
            if(s[i]=='B') {
                b++;
            } else {
                ret+=b;
            }
        }
        
        System.out.println(ret);
    }
}