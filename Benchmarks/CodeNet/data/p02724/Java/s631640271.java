import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int X = sc.nextInt();
        int n500 = X/500;
        int n5 = (X%500)%5;
        System.out.println(n500*1000+n5*5);
    }
}