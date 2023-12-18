import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Blue = sc.nextInt();
        int Red = sc.nextInt();
        int count = 0;
        int countB = Blue;
        int countR = Red;
        boolean boolBlue = false;
        for(int i=0; i<N; i++){
            if(Blue==0 && Red==0){
                Blue = countB;
                Red = countR;
            }
            if(Blue>0){
                count++;
                Blue--;
            } else if(Blue==0 && Red>0){
                Red--;
            }
        }
        System.out.println(count);
    }
}