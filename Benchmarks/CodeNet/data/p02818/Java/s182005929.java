import java.util.HashMap;
import java.util.Scanner;
public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        long a,b,k;
        a=nextLong();
        b=nextLong();
        k=nextLong();
        if(a-k>0){
            print(a-k+" "+b);
        }
        else{
            b+=a-k;
            if(b<0) print(0+" "+0);
            else print(0+" "+b);
        }
    }



    public static int nextInt(){
        return Integer.parseInt(scan.next());
    }
    public static long nextLong(){
        return Long.parseLong(scan.next());
    }
    public static String next(){
        return scan.next();
    }
    public static double nextDouble(){
        return Double.parseDouble(scan.next());
    }
    public static float nextFloat(){
        return Float.parseFloat(scan.next());
    }

    //Yes or No
    public static void yesNo(boolean flag){
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void print(Object a){
        System.out.println(a);
    }
}
