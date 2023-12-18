import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();

		for(int i=1;i<=n;i++){
			int num=i;
			int j=0;
			while(num>0){
				num/=10;
				j++;
			}
			ans+=j%2==1?1:0;
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}