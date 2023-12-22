import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int listCount = scanner.nextInt();
		int[] listSort = new int[listCount];
		for(int i = 0; i < listCount; i++){
			listSort[i] = scanner.nextInt();
		}
		trace(listSort, listCount);
		insertionSort(listSort, listCount);
	}

	private static void insertionSort(int[] listSort, int listCount){
		for(int i = 1; i < listCount; i++){
			int v = listSort[i];
			int j = i - 1;
			while((j >= 0) && (listSort[j] > v)){
				listSort[j + 1] = listSort[j];
				j--;
			}
			listSort[j + 1] = v;
			trace(listSort, listCount);
		}
	}

	private static void trace(int[] listSort, int listCount){
		int jugeCount = listCount - 1;
		for(int i = 0; i < listCount; i++){
			System.out.print(listSort[i]);
			if(i < jugeCount){
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
}