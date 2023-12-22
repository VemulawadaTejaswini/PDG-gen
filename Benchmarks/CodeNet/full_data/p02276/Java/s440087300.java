import java.util.Scanner;

public class Main {
	public static int[] num = new int[100000];
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 要素の個数
		//int[] num = new int[n]; // 個数のリスト

		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}
		int partition_num = Partition(0,n-1);
		for (int i = 0; i < partition_num; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.print("["+num[partition_num]+"]");
		for (int i = partition_num+1; i < n ; i++) {
			System.out.print(" " + num[i]);
		}
		System.out.println();
	}

	public static int  Partition(int p, int r){
		int x =num[r];
		int i = p -1;
		for(int j = p; j<r;j++){
			if(num[j] <= x){
				i = i +1;
				int tmp = num[i];
				num[i] = num[j];
				num[j] = tmp;
			}
			
		}
		int tmp = num[i +1];
		num[i+1] = num[r];
		num[r]=tmp;
		return i + 1;
}

}

