import java.util.*;

class Main{
	public static void main(String[] args){
		int n,m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		if(n > m){
			int tmp = m;
			m = n;
			n = tmp;
		}
		for(int i = 0;i < m; ++i){
			System.out.printf("%d",n);
		}
	}
}