import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		int count=0;
		for (int i=1;i<=n;i++) {
			int p= sc.nextInt();
 
			if (p!=i) {
				count++;
			}
 
		}
		if(count<=2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
