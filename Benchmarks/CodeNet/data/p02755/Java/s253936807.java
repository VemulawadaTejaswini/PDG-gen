import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=100;i++){
            double eight = i*0.08;
            double ten = i*0.10;
            System.out.println(i+" "+eight+" "+ten);
            if(eight-a>=0&&eight-a<1&&ten-b>=0&&ten-b<1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }
}


