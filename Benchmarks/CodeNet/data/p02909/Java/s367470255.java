
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        switch (s.charAt(0)){
            case 'S':
                res = "Cloudy";
                break;
            case 'C':
                res = "Rainy";
                break;
            case 'R':
                res = "Sunny";
        }
        System.out.println(res);
        sc.close();
    }
}

class io{
    public static void YesNo(boolean f) {
        System.out.println(f?"Yes":"No");
    }
    public static void YESNO(boolean f) {
        System.out.println(f?"YES":"NO");
    }
}

class Algo{
    public static boolean isOdd(int n){
        return n % 2 == 1;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }


}

