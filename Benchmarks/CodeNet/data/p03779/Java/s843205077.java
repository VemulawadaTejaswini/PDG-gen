import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int time = 1;
        int now = 0;
        while(true) {
            if(now+time == x) {
                break;
            }else if(time < x-now-time) {
                now += time;
            }
            time++;
        }
        System.out.println(time);
    }
    
    
}
