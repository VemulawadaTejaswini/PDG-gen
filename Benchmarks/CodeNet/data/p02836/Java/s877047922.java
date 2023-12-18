import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        int count = 0;
        int minIndex = 0;
        int maxIndex = S.length()-1;
        
        while (minIndex < maxIndex) {
            if (S.charAt(minIndex++) != S.charAt(maxIndex--)) {
                count ++;
            }
        }
        
        System.out.println(count);
    }
}