import java.util.Scanner;
public class Main {
	private int page;
	private int max;
	 boolean flg = true;
	public Main(int a,int b){
		page = a;
		max = b;
	}
	public void study(){
		this.page -= this.max;
		if(this.page <=0){
			this.page = 0;
			this.flg = false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l,a,b,c,d,ans = 0;
		 l = sc.nextInt();
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 d = sc.nextInt();
		Main ko = new Main(a,c);
		Main su = new Main(b,d);
		while(ko.flg || su.flg){
			ko.study();
			su.study();
			ans ++;
		}
		System.out.println(l - (ans));
	}

}