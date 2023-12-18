import java.util.*;
import java.io.*;

/*
   AtCoder contests
   coder : yoichion
 */

public class Main {
    public static String repeat(String s, int t){
        String ans = "";
        for(int i=0;i<t;i++) ans = ans + s;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        System.out.println("Christmas"+ repeat(" Eve",25-D));
    }
}