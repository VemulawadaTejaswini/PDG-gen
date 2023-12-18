import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.next());
		Long a = Long.parseLong(sc.next());
		Long b = Long.parseLong(sc.next());
		
		if((a - b) % 2 == 0 ) {
			System.out.println(Math.abs(a -b)/2);
		}else {
			
			//壁に集まる
			Long temp1 = Math.max(a -1, b - 1);
			Long temp2 = Math.max(n - a , n - b);
			Long ans = Math.min(temp1,temp2);
			
			//左壁で調整
			Long ans2 = ((b - a - 1) /2 ) +  a;
			if(ans2 >= 0) {
				ans = Math.min(ans, ans2);
			}
			
			//右壁で調整
			Long ans3 =((n -(a + n- b + 1))/2) + (n - b + 1)  ;
			if(ans3 >= 0) {
				ans = Math.min(ans, ans3);
			}
			
			System.out.println(ans);
			
		}
		

	}

}