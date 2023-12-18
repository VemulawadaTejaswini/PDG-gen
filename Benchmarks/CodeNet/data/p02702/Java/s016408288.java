
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
        for(int i = 4; i <= s.length(); i++){
            for(int j = 0; j <= s.length() - i; j++){
                BigInteger t = new BigInteger(s.substring(j, j+i));
                if(t.mod(new BigInteger("2019")).equals(new BigInteger("0"))){
                    count++;
                }
            }
        }
        System.out.print(count);
    }

}
