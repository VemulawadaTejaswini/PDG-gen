import java.util.Scanner;

import static java.lang.Long.parseLong;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        String strN = String.valueOf(N);
        long len = strN.length();
        char c[]=strN.toCharArray();

        long sum = 0;

        for (int i =0; i<len;i++) {
            int ii = c[i];
            sum = sum + ii;
        }
        if (N == 0){
            System.out.println("Yes");
        }
        else{
            if (sum % 9 == 0){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
    }
}