import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        
        long a = -1000;
        long b = -1000;
        boolean hasFinished = false;
        for(a = -1000;a <= 1000;a++) {
            for(b = -1000;b <= 1000;b++) {
                if(((a * a * a * a * a) - (b * b * b * b * b)) == x) {
                    hasFinished = true;
                    break;
                }
            }
            if(hasFinished) break;
        }
    
        System.out.println(a + " " + b);
    }
    
}
