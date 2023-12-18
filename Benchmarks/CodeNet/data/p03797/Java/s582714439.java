import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	//S
		int m=sc.nextInt();	//C
		int cnt=0;
		if(n>0 && m>n*2) {	//s:c=1:2なので
			cnt+=n;
			m=m-(cnt*2);		//使ったcの数を引く
		}
		if(m>=4) {		//cが4個でScc作れる
			cnt+=m/4;
		}
		System.out.println(cnt);

	}

}