import java.math.*;
import java.util.*;


public class Main {

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        String str =scan.next();
        int count=0;
       
        for(int i=0;i<str.length()-3;i++){
            for(int j=i+4;j<=str.length();j++){
               
                BigInteger B = new BigInteger(str.substring(i,j));
                if(BigInteger.ZERO == B.remainder(BigInteger.valueOf((long) 2019))){
                    count++;
                }
              
            }
            
        }
        System.out.println(count);
    }

}
