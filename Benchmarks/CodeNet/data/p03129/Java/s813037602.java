import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(n % 2 == 0){
			if(n / 2 >= k){
				System.out.print("YES");
			}else{
				System.out.print("NO");
			}
		}else{
			if(n / 2 + 1>= k){
				System.out.print("YES");
			}else{
				System.out.print("NO");
			}
		}
	}
}
