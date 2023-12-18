import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < 3; i++){
			ans += (n%10==1?9:1)*Math.pow(10,i);
			n/=10;
		}
		System.out.print(ans);
	}
}
