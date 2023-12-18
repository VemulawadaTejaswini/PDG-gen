import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean flag = false;
		if(n == 2)  flag = true;
		while(!flag){
			for(int i = 3; i * i <= n; i += 2){
				if(n % i == 0) flag = false;
			}
			if(!flag)n++;
		}
		System.out.print(n);
	}
}
