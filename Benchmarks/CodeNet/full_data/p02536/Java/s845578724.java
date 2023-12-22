import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  private int[] _parent;
	  private int[] _rank;


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arrayA = new int[m+1];
		int[] arrayB = new int[m+1];
		for(int i=1;i<=m;i++) {
			arrayA[i] = sc.nextInt();
			arrayB[i] = sc.nextInt();
		}
		sc.close();



		int[] array = new int[n+1];
		Arrays.fill(array, -1);

		array[0]=arrayA[1];
		for(int i=1;i<=m;i++) {
			int a = arrayA[i];
			if(array[i]==-1) {
				array[i]=a;
			}else {
				a = array[i];
			}
			if(array[arrayB[i]]==-1) {
				array[arrayB[i]]=a;
			}
		}

		Arrays.sort(array);
		int tmp = array[0];
		int ans = 1;
		for(int i=1;i<=m;i++) {
			if(array[i]==-1) {
				ans++;
			}else if(array[i]!=tmp) {
				ans++;
				tmp = array[i];
			}
		}
		System.out.println(ans-1);
	}
}
