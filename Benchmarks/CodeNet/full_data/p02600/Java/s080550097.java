import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(400 <= X && X <= 599){
            System.out.println(8);
        }else if(600 <= X && X <= 799){
            System.out.println(7);
        }else if(800 <= X && X <= 999){
            System.out.println(6);
        }else if(1000 <= X && X <= 1199){
            System.out.println(5);
        }else if(1200 <= X && X <= 1399){
            System.out.println(4);
        }else if(1400 <= X && X <= 1599){
            System.out.println(3);
        }else if(1600 <= X && X <= 1799){
            System.out.println(2);
        }else if(1800 <= X && X <= 1999){
            System.out.println(1);
        }
    }
}
