import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt();
        for(int i=1;i<=H;i++){
            for(int j=1;j<=W;j++){
                String cur = sc.next();
                if(!cur.equals("snuke")) continue;
                char col = (char)(j-1+'A');
                String ans = Character.toString(col)+Integer.toString(i);
                System.out.println(ans);
                return;
            }
        }
    }
}
