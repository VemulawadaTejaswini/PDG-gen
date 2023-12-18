import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] base = sc.nextLine().split(" "); //[N, C]
        int N = parseInt(base[0]);
        int C = parseInt(base[1]);
        
        long maxCal = 0;
        long nowCal = 0;
        long pre = 0;
        for (long i = 0; i < N; i++) {
        	String[] sushi = sc.nextLine().split(" ");
        	long x = parseLong(sushi[0]);
        	long v = parseLong(sushi[1]);
        	nowCal += (v - (x - pre));
        	if (maxCal < nowCal) {
        		maxCal = nowCal;
        	}
        	pre = x;
        }
        long ans = (maxCal > nowCal) ? maxCal : nowCal;
        System.out.println(ans);
    }
}