import java.util.Scanner;
public class Main {
	static void search(){
		Scanner sc = new Scanner(System.in);
		int idx = 10000000;
		int[] num = new int[idx];
		int number,ans = 0;
		for(int i = 0; i < idx; i++){
			num[i] = 0;
		}
		for(int i = 0; i < 2; i++){
			int n = sc.nextInt();
			for(int j = 0; j < n; j++){
				number = sc.nextInt();
				if(num[number] == i) num[number]++;
			}
		}
		for(int i = 0; i < idx; i++){
			if(num[i] == 2) ans++;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		search();
	}
}