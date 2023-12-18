import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short BIGIN_NUMBER = scan.nextShort();
        short END_NUMBER = scan.nextShort();
        int X = scan.nextInt();
        
        int score = 0;
        
        for(short i = BIGIN_NUMBER; i <= END_NUMBER; i++) {
            if(i % X == 0) {
                score++;
            }
        }
        System.out.println(score);
    }
}