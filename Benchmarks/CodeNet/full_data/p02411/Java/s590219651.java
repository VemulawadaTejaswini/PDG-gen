import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        int m, f, r;
        MainRoop : while(true){
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();

            if(m == -1 && f == -1 && r == -1)break MainRoop;

            String p = "";
            if(m == -1 || f == -1)p = "F";
            else if(m + f >= 80)p = "A";
            else if(m + f >= 65)p = "B";
            else if(m + f >= 50)p = "C";
            else if(m + f >= 30){
                if(r >= 50)p = "C";
                else p = "D";
            }else p = "F";

            System.out.println(p);
        }
    }
  
}
