import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int wide = Integer.parseInt(sc.next());
        int height = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        double res = wide*height/2;
        int i = 0;
        if(wide==1||height==1) {
            System.out.println(res+" "+i);
            return;
        }
        if(wide%2==0&&w*2==wide) {
            if(height%2==0&&h*2==height) {
                i = 1;
            }
        }
        System.out.println(res+" "+i);
    }
}
