import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int pL = l % 2019;
        int pR = r % 2019;
        if(r - l >= 2019)
        	System.out.println(0);
        else
        	System.out.println(Math.min(pL*(pL+1), pR*(pR-1)));
    }
}
