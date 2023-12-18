import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] a = new String[H+2];
        a[0] = "";
        a[H + 1] = "";

        for(int i=1; i<=H; i++){
            a[i] = sc.next();
        }
        for(int i=1; i<=W; i++){
            a[0] += "#";
            a[H + 1] += "#";
        }
        

        for(int i=0; i<H+2; i++){
            System.out.println("#" + a[i] + "#");
        }
    }
}