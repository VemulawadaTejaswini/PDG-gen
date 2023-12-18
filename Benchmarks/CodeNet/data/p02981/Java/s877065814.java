import java.util.*;
public class Main {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int ninzuu = sc.nextInt();
		int densha = sc.nextInt();
		int taxi = sc.nextInt();
		
		int ans = ninzuu * densha;
		if(ans >= taxi){
			ans = taxi;
		}

		System.out.println(ans);
	}
}
