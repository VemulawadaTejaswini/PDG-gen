import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S  = sc.next();

        int count0=0;
        int count1=0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c=='0') count0++;
            if(c=='1') count1++;
        }

        System.out.println(Math.min(count0,count1)*2);
    }
}
