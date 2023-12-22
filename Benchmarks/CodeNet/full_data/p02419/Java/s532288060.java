import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
         
        String w;
        String t;
        int countW;
         
        w = stdin.next();
         
        countW = 0;
        while (true) {
            t = stdin.next();
            if ("END_OF_TEXT".equals(t)) {
                break;
            }
             
            if (w.equalsIgnoreCase(t) || w.equalsIgnoreCase(t)) {
                countW++;
            }
        }
         
        System.out.println(countW);
        
        stdin.close();
    }
}