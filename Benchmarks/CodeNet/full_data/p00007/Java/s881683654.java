import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, ans;
		while(sc.hasNext()){
			n = sc.nextInt();
			ans = 100000;
			for(int i = 0; i < n; i++){
				ans += ans / 20;
				if(ans != (ans = ans / 1000 * 1000)){
					ans += 1000;
				}
			}
			System.out.println(ans);
		}
	}
}