import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        int D =sc.nextInt();
        boolean isfinished = false;

        while(!isfinished){
            C -= B;
            if(C<=0){
                System.out.println("Yes");
                isfinished = true;
            } else {
                A -=D;
                if(A<=0){
                    System.out.println("No");
                    isfinished = true;
                }
            }
        }



    }

}







