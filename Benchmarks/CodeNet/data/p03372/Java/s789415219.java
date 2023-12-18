import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] base = sc.nextLine().split(" "); //[N, C]
        int N = parseInt(base[0]);
        int C = parseInt(base[1]);
        
        int maxCal = 0;
        int nowCal = 0;
        int pre = 0;
        for (int i = 0; i < N; i++) {
        	String[] sushi = sc.nextLine().split(" ");
        	int x = parseInt(sushi[0]);
        	int v = parseInt(sushi[1]);
        	nowCal += (v - (x - pre));
        	if (maxCal < nowCal) {
        		maxCal = nowCal;
        	}
        	pre = x;
        }
        int ans = (maxCal > nowCal) ? maxCal : nowCal;
        System.out.println(ans);
    }
}