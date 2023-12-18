import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int[] p1;
	int[] p2;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		p1 = new int[n];
		p2 = new int[n];

		for(int i=0;i<n;i++){
			p1[i]=sc.nextInt();
			p2[i]=p1[i];
		}

		Arrays.sort(p2);

		for(int i=0;i<n;i++){
			ans += p1[i]==p2[i]?0:1;
		}

		// 出力
		System.out.println(ans>2?"NO":"YES");
	}

	public static void main(String[] args){
		new Main();
	}
}