import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,r,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		l = sc.nextInt();
		r = sc.nextInt();
		ans = 2020;
		for(int i=l;i<l+672&&i<r;i++){
			for(int j=i+1;j<l+673&&j<=r;j++){
				ans = ans>(i*j)%2019?(i*j)%2019:ans;
			}
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}