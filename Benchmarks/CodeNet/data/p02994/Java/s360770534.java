import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] ar = new int[n];
        int sum = 0;
        int res = 114514;
        for (int i = 0; i < n; i++) {
            ar[i] = l+i;
            sum += ar[i];
            if(Math.abs(res) > Math.abs(ar[i])){
                res = ar[i];
            }
        }
        res = sum - res;
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

