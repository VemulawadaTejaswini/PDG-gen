import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long X = sc.nextLong();
        long n500 = X/500;
        long n5 = (X%500)/5;
        System.out.println(n500*1000+n5*5);
    }
}