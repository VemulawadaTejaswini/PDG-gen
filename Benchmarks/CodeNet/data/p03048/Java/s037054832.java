import java.util.Scanner;

public class Main {

    private static final Scanner  SC = new Scanner(System.in);
    private static final int R = SC.nextInt();
    private static final int G = SC.nextInt();
    private static final int B = SC.nextInt();
    private static final int N = SC.nextInt();
    private static final int R_MAX = N/R;
    private static final int G_MAX = N/G;
    private static final int B_MAX = N/B;


    public static void main(String[] args) {
        int result = 0;
        for(int r=0;r<=R_MAX; r++){
            for(int g=0;g<=G_MAX; g++){
                for(int b=0;b<=B_MAX; b++){
                    if(R*r+G*g+B*b==N) result++;
                }
            }
        }
        System.out.println(result);
    }
}