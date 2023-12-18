import java.util.Scanner;

public class Main {

    private static final Scanner  SC = new Scanner(System.in);
    private static final String RESULT = SC.next();

    public static void main(String[] args) {
        int victory = 0;
        int day = 0;
        final int BORDER = 8;

        for(char c : RESULT.toCharArray()){
            day++;
            if(c=='o'){
                victory++;
            }
        }

        final int DAYS_LEFT = 15-day;

        if ((DAYS_LEFT - (BORDER - victory))<0) {
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}