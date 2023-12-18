import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,r,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		k = sc.nextInt();
		x = sc.nextInt();

		l = Math.max(x-k+1,-1000000);
		r = Math.min(x+k-1, 1000000);

		// 出力
		for(int i=l;i<=r;i++)
			System.out.print(i+" ");
	}

	public static void main(String[] args){
		new Main();
	}
}