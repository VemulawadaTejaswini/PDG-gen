import java.util.Scanner;
public class Main {
	static void search(){
		Scanner sc = new Scanner(System.in);
		int m, n, num2, number = 0;
		m = sc.nextInt();
		int[] num1 = new int[m];
		int idx = 10000000;
		int[] num = new int[idx];
		for(int i = 0; i < idx; i++) num[i] = 0;
		for(int i = 0; i < m; i++){
			num1[i] = sc.nextInt();
		}
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			num2 = sc.nextInt();
			int j = 0;
			while(j < m){
				if(num1[j] == num2 && num[num2] == 0){
					number++;
					num[num2] = 1;
					break;
				}
				j++;
			}
		}
		System.out.println(number);
	}
	public static void main(String[] args) {
		search();
	}
}