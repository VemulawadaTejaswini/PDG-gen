import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long now = 100;
        int y = 0;
        while(x > now){
            now = (long)Math.floor((double)now * 1.01);
            y++;
        }
        System.out.println(y);
    }
}