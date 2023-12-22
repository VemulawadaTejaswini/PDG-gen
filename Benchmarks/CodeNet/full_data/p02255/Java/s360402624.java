import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++)
			num[i] = sc.nextInt();
		for(int j = 0; j < n; j++)
			System.out.print(num[j] + " ");
		System.out.println();
		for(int i = 1; i < n; i++){
			for(int j = 0; j < i; j++){
				if(num[i] < num[j]){
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
			for(int j = 0; j < n; j++)
				System.out.print(num[j] + " ");
			if(i != n-1)
				System.out.println();
		}
	}
}