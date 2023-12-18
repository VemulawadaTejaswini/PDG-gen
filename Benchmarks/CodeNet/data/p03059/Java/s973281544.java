import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();

        int bic = 0;
        double t = (T+0.5)/A;
        for(int i=1;i<=t;i++){
               bic +=B;
        }
        System.out.println(bic);
    }
}