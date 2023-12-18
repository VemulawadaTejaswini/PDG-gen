import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ret = 0;
        if (x>=0&&y>=0) {
            if (x>y) {
                ret = x-y+2;
            } else {
                ret = y-x;
            }
        } else if (x<0&&y<0) {
            if (x>y) {
                ret = x-y+2;
            } else {
                ret = y-x;
            }
        } else {
            ret = Math.abs(Math.abs(x)-Math.abs(y))+1;
        }
        
        System.out.println(ret);
    }
}
