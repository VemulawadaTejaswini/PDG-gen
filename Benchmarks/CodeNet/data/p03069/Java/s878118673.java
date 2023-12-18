import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // C - Stones

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        
        char[] c = s.toCharArray();
        
        int countB = 0;
        int countW = 0;
        boolean isBlack = false;
        boolean isWhite = false;
            
        for (int i = 0, j = n -1; i < n; i++, j--) {
            if (c[i] == '#') {
                isBlack = true;
            } else if (isBlack) {
                ++countB;
            }
            if (c[j] == '.') {
                isWhite = true;
            } else if (isWhite) {
                ++countW;
            }
        }

        System.out.println((countB < countW ?  countB : countW));
    }

}