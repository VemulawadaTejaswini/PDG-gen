import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double H = sc.nextDouble();
        double W =sc.nextDouble();
        double N = sc.nextDouble();

        double ans;

        if(H <= W){
           ans = Math.ceil(N/W);
        }else{
            ans = Math.ceil(N/H);
        }

        System.out.println((int)ans);

    }
}

