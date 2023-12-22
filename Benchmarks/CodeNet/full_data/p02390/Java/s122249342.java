import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        int h = t/3600;

        int m = (t-(h*3600))/60;

        int s = t%60;

        System.out.println(h+":"+m+":"+s);

        scn.close();
    }
}

