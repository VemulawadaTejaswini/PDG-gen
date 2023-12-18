import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long tmp = 0;
        while ((tmp = a % b) != 0){
            a = b;
            b = tmp;
        }

//        System.out.println(b);

        long ans = 0;

//        boolean flag = false;

//        if (b%2==0) ans++;

        double sqrt = Math.sqrt(b);

        for (int i=2; i<=sqrt+1; i++){
            if (b%i==0){
                ans++;
                while (b%i==0){
                    b /= i;
                }
            }
        }

//        if (b!=1){
//            ans++;
//        }



        System.out.println(ans+1);
    }
}


