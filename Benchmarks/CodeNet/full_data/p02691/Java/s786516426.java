import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int n = nextInt();
        int con = 0;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = nextInt();
        }
        for(int i = 0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(Math.abs(i-j)==arr[i]+arr[j]){
                    con += 1;
                }
            }
        }
        print(con);
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