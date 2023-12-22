import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String S = in.readLine();
        String T = in.readLine();
        if(S.length() + 1 == T.length() && S.equals(T.substring(0, T.length() - 1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
