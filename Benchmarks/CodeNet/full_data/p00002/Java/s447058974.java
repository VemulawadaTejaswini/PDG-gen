import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    while(sc.hasNext()){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int m = 1;
        //System.out.println(c);
        while(c >= 10){
        m++;
        c = c/10;
        //System.out.println(c);
        }
        System.out.println(m);
    }
    }
}