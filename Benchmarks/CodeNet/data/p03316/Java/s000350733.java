import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
　　　//入力表示
		int N = sc.nextInt();
		int sum=0;
		int ten=N;
		
      //位ごとに足していく
		while(ten>0) {
			sum+=ten %10;
			ten/=10;
		}
      
      //Nを足しと答えと割って余りが0ならyesと表示
		System.out.println(N%sum==0 ? "Yes":"No");
		
	}
}