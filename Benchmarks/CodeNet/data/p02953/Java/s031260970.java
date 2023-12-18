import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		H[0] = sc.nextInt();
		boolean jud = true;
		
		for(int i=1;i<N;i++) {
			H[i] = sc.nextInt();
			if(H[i] > H[i-1]) {
				H[i] -= 1;
			}else if(H[i]<H[i-1]) {
				jud = false;
				break;
			}
		}
		
		if(jud) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}