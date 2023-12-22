import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner scan = new Scanner(System.in);
        int plusCount = scan.nextInt();
        int zeroCount = scan.nextInt();
        int minusCount = scan.nextInt();
        int getCount = scan.nextInt();
        scan.close();
        int score = 0;

        if (getCount - plusCount <= 0) {
            score = getCount;
        } else {
            getCount -= plusCount;
            score += plusCount;
            if (getCount - zeroCount <= 0) {
            } else {
                getCount -= zeroCount;
                if (getCount - minusCount <= 0) {
                  score -= getCount;
                } else {
                    score -= minusCount;
                }
            }
        }

        System.out.println(score);

        
    }
}
