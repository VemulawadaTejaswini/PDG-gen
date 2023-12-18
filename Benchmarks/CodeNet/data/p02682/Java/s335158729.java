import java.util.Scanner;


public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int a = nextInt();
        int  b= nextInt();
        int  c= nextInt();
        int k = nextInt();

        int sum =0;
        while(a>0&&k>=0){
            sum+=1;
            a -=1;
            k-=1;
        }
        while(b>=0&&k>=0){
            k-=1;
            b-=1;
        }
        while(c>=0&&k>=0){
            sum-=1;
            c -=1;
            k-=1;
        }
        print(sum);
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