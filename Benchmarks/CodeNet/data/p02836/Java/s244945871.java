package palindrom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s = "abcdabc";
        int count = 0;
        int l = s.length() - 1;

        for(int i=0;i<=l;i++){
            if (s.charAt(i) != s.charAt(l)) {
                count++;
                i++;
                l--;

            }

        }
        System.out.println(count);
    }

}
