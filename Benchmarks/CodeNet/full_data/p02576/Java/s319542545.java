import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        
        int times = N/X + ((N%X == 0) ? 0 : 1);
        System.out.println(times*T);
    }
}
