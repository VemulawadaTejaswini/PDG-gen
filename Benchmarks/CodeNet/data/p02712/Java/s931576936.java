import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
 
		//FizzBuzz列の項目数
		int N=sc.nextInt();
		long count=0;
		int constraints=(int)Math.pow(10, 6);
		
		if(N<=constraints) {
		for(int i=1;i<=N;i++) {
			if(!(i%3==0&&i%5==0)) {
				if(!(i%3==0||i%5==0)) {
					count+=i;
				}
			}
		}
		System.out.println(count);
	}
  }
}