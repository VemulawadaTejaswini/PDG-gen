import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] sortList = new int[count];
		for(int i = 0; i < count; i++){
			sortList[i] = scanner.nextInt();
		}
		int anser = bubbleSort(sortList, count);
		for(int i = 0; i < count; i++){
			if(i != count - 1){
				System.out.print(sortList[i] + " ");
			}else{
				System.out.println(sortList[i]);
			}
		}
		System.out.println(anser);
	}

	private static int bubbleSort(int[] sortList, int count){
		int exchange_count = 0;
		int temp = 0;
		for(int j = 0; j < count; j++){
			for(int i = count - 1; i > j; i--){
				if(sortList[i] < sortList[i - 1]){
					temp = sortList[i];
					sortList[i] = sortList[i - 1];
					sortList[i - 1] = temp;
					exchange_count++;
				}
			}
		}
		return exchange_count;
	}
}