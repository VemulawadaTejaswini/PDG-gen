import java.util.Scanner;


public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int a = nextInt();
        int  b= nextInt();
        int  c= nextInt();
        int k = nextInt();
        int sum = 0;

        if(k<=a){
            print(k);
            System.exit(0);
        }
        if(k<=a+b){
            print(a);
            System.exit(0);
        }
        else{
            print(a-(k-a-b));
            System.exit(0);
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