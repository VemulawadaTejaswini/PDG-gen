import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;

		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
      
      		Arrays.sort(a);


		for(int j = 0;j < n;j++){
			for(int k = j + 1;k < n;k++){
				for(int l = k + 1;l < n;l++){
					if(a[j] + a[k] > a[l] && a[j] + a[l] > a[k] &&a[l] + a[k] > a[j] ){
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}

}