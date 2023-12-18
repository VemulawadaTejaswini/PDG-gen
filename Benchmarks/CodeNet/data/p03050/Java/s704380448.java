import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		//恐らくO(logN)orO(1)だと思う
		long a=scan.nextLong();
		long ans=0;
		for(long i=1;;i++) {//iはあまりの数
			if(i*i>=a-i) {
				break;
			}
			if((a-i)%i==0) {
				ans+=(a-i)/i;
			}
		}
		System.out.println(ans);
	}
}