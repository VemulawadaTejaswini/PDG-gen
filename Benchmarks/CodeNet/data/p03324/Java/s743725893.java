import java.util.*;


public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int N = sc.nextInt();

        if(D == 0){
        	System.out.println(N);
        }else if(D > 0){
        	int ans = (int)Math.pow(100 * 1.0, D) * N;

        	System.out.println(ans);
        }

	}
}