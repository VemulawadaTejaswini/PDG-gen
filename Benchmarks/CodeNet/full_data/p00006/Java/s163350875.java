

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        String str;
        char strR[] = new char[100];
        Scanner keyb = new Scanner(System.in);
        str = keyb.nextLine();
        int len =  str.length();
        for (int i  = len-1; i >= 0; i--) {
            strR[len-i-1] = str.charAt(i);
        }
        strR[len] = '\0';
        System.out.println(strR);
    }
    
}