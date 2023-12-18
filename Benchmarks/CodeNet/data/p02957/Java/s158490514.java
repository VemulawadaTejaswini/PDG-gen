import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean bool = true;
		if(A != B) {
			for(int i = 0;i<=(A+B)/2;i++) {
				if((A-i)*(A-i) == (B-i)*(B-i)) {
					System.out.println(i);
					bool = false;
					break;
				}
			}
		}
		if(bool) {
			System.out.println("IMPOSSIBLE");
		}


	}

}