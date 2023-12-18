import java.util.Scanner;

public class Main {

    private static final Scanner  SC = new Scanner(System.in);
    private static final int R = SC.nextInt();
    private static final int G = SC.nextInt();
    private static final int B = SC.nextInt();
    private static final int N = SC.nextInt();
    private static final int R_MAX = N/R;


    public static void main(String[] args) {
        int gMax = 0;
        int bMax = 0;
        
        int result = 0;
        for(int r=0;r<=R_MAX; r++){
            gMax = (N-r)/G;
            for(int g=0;g<=gMax; g++){
                bMax = (N-r-g)/B;
                for(int b=0;b<=bMax; b++){
                    if(R*r+G*g+B*b==N) result++;
                }
            }
        }
        System.out.println(result);
    }
}