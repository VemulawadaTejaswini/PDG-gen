import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        String s;
        MainRoop : while(true){
            s = sc.next();

            if(s.equals("0"))break MainRoop;

            int sum = 0;
            for(int i = 0; i < s.length(); i++)sum += (s.charAt(i) - '0');

            System.out.println(sum);
        }
    }
  
}
