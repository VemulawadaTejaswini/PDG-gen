import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		n = sc.nextInt();

		a = sc.nextInt();
		x = a;

		for(int i=0;i<n-1;i++)x = x^sc.nextInt();

		// 出力
		System.out.println(x==0?"Yes":"No");
	}

	public static void main(String[] args){
		new Main();
	}
}