import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] spl = sc.nextLine().split(" ");
		int[] h = new int[N];
		for(int i = 0;i < N;i++){
			h[i] = Integer.parseInt(spl[i]);
		}
		sc.close();

		int cnt = 0;
		for(int i = 1;i < N;i++){
			if(h[i] - h[i-1] < 0){
				h[i-1]--;
				if(h[i-1] <= 0){
					System.out.println("No");
					break;
				}
				cnt++;
			}
		}
		if(cnt > 1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}