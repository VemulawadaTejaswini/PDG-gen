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

		if(l%2019==0||r%2019==0||r-l>=2019)ans=0;
		else {
			a = l/2019;
			if((a+1)*2019<r){
				ans=0;
			} else {
				ans = (l*(l+1))%2019;
			}
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}