
import static java.lang.Math.pow;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int s = in.nextInt();
        if(r>=1&&r<=100&&s>=1&&s<=pow(10,5)){
            if(r*500>=s){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
