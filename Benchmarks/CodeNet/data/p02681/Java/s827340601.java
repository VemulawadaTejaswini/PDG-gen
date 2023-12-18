import java.util.Scanner;


public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        String s = next();
        String t = next();
        boolean flag = false;
        if(s.contains("1")|
        s.contains("2")||
        s.contains("3")||
        s.contains("4")||
        s.contains("5")||
        s.contains("6")||
        s.contains("7")||
        s.contains("8")||
        s.contains("9")||
        s.contains("0")){
            flag =false;
        }
        else flag = true;
        if(t.startsWith(s) && t.length()==s.length()+1){
            flag = true;
        }
        else flag = false;
        yesNo(flag);
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