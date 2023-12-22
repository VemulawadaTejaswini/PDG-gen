
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = 0;
        if(s.length()<4){
            System.out.print("0");
        }
        else{
            BigInteger n = new BigInteger("2019");
            BigInteger zero = new BigInteger("0");
            for(int i = 0; i <= s.length() - 4; i++){
                for(int j = 4; i + j <= s.length(); j++){
                    BigInteger t = new BigInteger(s.substring(i, i+j));
                    if(t.mod(n).equals(zero)){
                        count++;
                    }
                }
            }
            System.out.print(count);
        }
    }

}