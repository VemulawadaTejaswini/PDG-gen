

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String s = num2alphabet(N);
        System.out.println(s);
    }

    public static String num2alphabet(long num) {

        long firstIndexAlpha = (int)'a'; 
        long sizeAlpha = 26; 

        if (num <= 0) {
            
            return "";

        } else if (num <= sizeAlpha) {
            
            return String.valueOf((char)(firstIndexAlpha + num - 1));

        } else {

            long offset = num -1;
            long tmp = offset;
            String str = "";
            while(true) {
                long div = tmp / sizeAlpha; 
                long mod = tmp % sizeAlpha; 

                str = num2alphabet(mod + 1) + str;

                if (div <= 0) {
                    break;
                }

                tmp = (div -1);
            };
            return str;
        }
    }
}
