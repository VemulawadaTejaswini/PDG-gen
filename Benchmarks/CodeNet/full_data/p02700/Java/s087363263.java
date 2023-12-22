import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt(); int ha = a;
        int b = sc.nextInt(); int hb = b;
        int c = sc.nextInt(); int hc = c;
        int d = sc.nextInt(); int hd = d;

        boolean turn = true;

        while(true){
            if(turn){
                hc -= a;
                if(hc <= 0){
                    System.out.println("Yes");
                    return;
                }
                turn  = false;
            }else{
                ha -= c;
                if(ha <= 0){
                    System.out.println("No");
                    return;
                }
                turn = true;
            }
        }
    }
}