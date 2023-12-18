import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		//恐らくO(logN)orO(1)だと思う
		long a=scan.nextLong();
		long ans=0;
		for(long i=1;i<a;i++) {//iはあまりの数
			long minus=a-i;
			if(minus%i==0) {
				ans+=minus/i;
			}
			if(i*i>a) {
				break;
			}
		}
		System.out.println(ans);
	}
}