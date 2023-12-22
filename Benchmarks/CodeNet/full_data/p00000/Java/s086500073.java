import util.*;

public class Main{
    public static void main(String[] a){
        int x,y,ans;
        for(x=1;x<10;x++) {
            for(y=1;y<10;y++) {
                ans = x*y;
                System.out.print("" + x + "x" + y + "=" ans);
            }
        }
    }
}