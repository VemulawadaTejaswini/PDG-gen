import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<4; i++){
			int n1 = n % 10;
			if(n1 == 2){
				ans++;
			}
			n = (n-n1)/10;
		}
		
		System.out.println(ans);
	}
}