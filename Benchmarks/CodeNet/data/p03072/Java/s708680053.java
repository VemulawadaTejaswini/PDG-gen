
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		int[] a = new int[n];
		int ans=0;
		int max=0;
		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		for(int i=0; i<n; i++){
			if(max<=a[i]){
				ans++;
				max=a[i];
			}
		}
		System.out.println(ans);
	}

}
