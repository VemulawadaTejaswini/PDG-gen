import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				int result=i*j;
				if(result==N) {
					count++;
				}
			}
			
		}
		
		if(count!=0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
