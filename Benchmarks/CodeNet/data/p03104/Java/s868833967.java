import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  A = sc.nextLong();
        long  B = sc.nextLong();

        System.out.println(calc(B) ^ calc(A-1));

    }
    static long calc(long lng){

        long ans = 0;
        for(int i=1; i< 50;i++){
            long period=  1L << i;
            long count2 = (lng+1)/period * period/2;
            long count = count2+ Math.max(0, (lng+1)%period - period/2);
//            System.out.println("period:"+period+" "+i+" "+count +" "+ count2 +" remainder:"+(lng+1)%period + " zeros:" + period/2);
            if(count % 2 ==1 ){
                ans += (1L << (i-1) );
            }
        }
//        System.out.println(lng +" "+ans);
        return ans;
    }

}
