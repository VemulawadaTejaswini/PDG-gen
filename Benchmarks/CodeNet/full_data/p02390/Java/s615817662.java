import java.util.*;

public class Main{
    public static void main(String[] args){
        int h,m,s;

        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();

        s = sec%60;
        m = (sec/60)%60;
        h = sec/60/60;
        System.out.println(h + ":" + m + ":" + s);

    }
}
