import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double A = sc.nextDouble();
        Double B = sc.nextDouble();

        int ans = -1;

        for(int i =0;i<1100;i++){

            if(Math.floor(0.08*i) == A && Math.floor(0.1 *i) == B){
                ans = i;
                break;
            }

        }
        System.out.println(ans);



    }

}







