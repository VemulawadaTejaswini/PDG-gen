import java.util.Scanner;


public class Main {
	static int count = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
		}
		bubleSort(list);
/*		for (int i = 0; i < n; i++) {
			System.out.print(list[i]);
		}*/
	}
	//
	static void bubleSort(int[] list) {
		for(int i = 0; i < list.length; i++){
			for(int j = list.length -1; i < j; j--){
				if(list[j] < list[j - 1]){
					swap(list,j);
				}
			}
		}
		System.out.println(count);
	}
	//list[i] < list[j] ??????????´?????????´?????????????????????
	static void swap(int[] list, int j){
		int temp = list[j];
		list[j] = list[j - 1];
		list[j - 1] = temp;
		count++;
 	}
}