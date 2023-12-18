import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sp = s.split("/");
        int y = Integer.parseInt(sp[0]);
        int m = Integer.parseInt(sp[1]);
        int d = Integer.parseInt(sp[2]);
        String ans = "Heisei";
        if(y > 2019) ans = "TBD";
        else if(y == 2019 && m > 4) ans = "TBD";
        System.out.println(ans);
    }
}