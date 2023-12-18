import java.math.*;
import java.util.*;


public class Main {

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        String str =scan.next();
        int count=0;
        //String sun=str.substring(0,4);
        //System.out.println(sun);
        for(int i=0;i<str.length()-4;i++){

                //System.out.println(str.substring(i,i+5));
                BigInteger B = new BigInteger(str.substring(i,i+5));
                if(BigInteger.ZERO == B.remainder(BigInteger.valueOf((long) 2019))){
                    count++;
                }
               // System.out.println(B);
            }
            //System.out.println(count);

        System.out.println(count);
    }

}
