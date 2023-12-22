import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int V = sc.nextInt();
		int B = sc.nextInt();
		int W = sc.nextInt();
		int T = sc.nextInt();

		int adash = A+V*T;
		int bdash = B+W*T;
		if(adash>=bdash){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
    }
}
