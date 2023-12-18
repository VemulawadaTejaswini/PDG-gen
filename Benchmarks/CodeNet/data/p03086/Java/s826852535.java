

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int tmp = 0;
        int res = 0;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'A' || S.charAt(i) == 'T' || S.charAt(i) == 'G' || S.charAt(i) == 'C') {
                tmp++;
            }
                res = Math.max(tmp,res);
                tmp = 0;
        }
        System.out.println(res);
    }
}
