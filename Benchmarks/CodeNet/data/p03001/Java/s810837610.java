import java.util.*;

public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long w=sc.nextInt(),h=sc.nextInt();
		int x = sc.nextInt(),y=sc.nextInt();
		
		double ans1 = (h*w)/2.0;
		int ans2=0;
		if(x*2==w&&y*2==h) {
			ans2 = 1;
		}
		
		System.out.println(ans1+" "+ans2);
		
	}
		


}
