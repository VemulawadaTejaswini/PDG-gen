import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int D = sc.nextInt();
	        int ans = 0;
	        
	        int D1 = D + D + 1;
	        
	        if(N % D1 == 0){
	          ans = N / D1;
	        } else {
	          ans = N / D1 +1;
	        }
	        
	        System.out.println(ans);
	}
}