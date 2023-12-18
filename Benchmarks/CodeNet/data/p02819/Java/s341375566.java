import java.util.*;

class Main1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int cnt = 0;
		int ans = 0;
		boolean flag = false;
		
		for(int i = x; flag == false; i++){
			cnt=0;
			
			for(int j=2; j < i; j++){
				if(i % j == 1) cnt++;
			}
			
			if(cnt == i-2){
				flag = true;
				ans = i;
			}
			
		}
		
		System.out.print(ans);
	}
}
