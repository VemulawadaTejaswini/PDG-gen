import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Blue = Integer.parseInt(sc.next());
        int Red = Integer.parseInt(sc.next());
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
            System.gc();
        }
        System.out.println(count);
    }
}
