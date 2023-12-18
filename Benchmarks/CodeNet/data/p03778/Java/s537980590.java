import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Math.max(Math.abs(a-b)-w, 0);
        System.out.println(res);
    }
}

class io{
    public static void br(){
        System.out.println("");
    }

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

