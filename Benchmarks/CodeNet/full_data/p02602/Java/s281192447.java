import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        long n = nextLong();
        int k = nextInt();
        long[] arr = new long[(int)n];
        long tmp0 = 1;
        long tmp1 = 1;

        for(int i=0;i<n;i++){
            arr[i] = nextLong();
        }

        for(int i=0;i<k;i++){
            tmp0 *= arr[k-i-1];
        }
        //print(tmp0);

        for(int i=k;i<n;i++){
            for(int j=0;j<k;j++){
                //print(arr[i-j] + "arr[i-j");
                tmp1 *= arr[i-j];
            }
            if(tmp1>tmp0){
                print("Yes");
            }
            else print("No");
            //print("tmp0=" + tmp0);
            //print("tmp1=" + tmp1);
            tmp0 = tmp1;
            tmp1=1;
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

    //print
    public static void print(Object a){
        System.out.println(a);
    }


    //gcd
    public static int gcd (int a, int b){
        int tmp;
        while((tmp = a%b) != 0){
            a = b;
            b = tmp;
        }
        return b;
    }


    //lcm
    public static int lcm(int a,int b){
        int tmp;
        long c = a;
        c *= b;
        while((tmp = a%b) != 0){
            a = b;
            b = tmp;
        }
        return (int)(c/b);
    }
}