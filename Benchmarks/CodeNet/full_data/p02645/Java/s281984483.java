import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String S = sn.next();
        Random r = new Random();
        int rValue = r.nextInt(S.length()-3);
        if(S.length() == 3) System.out.println(S);
        else System.out.println(S.substring(rValue, rValue+3));

    }
}