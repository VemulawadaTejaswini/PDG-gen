
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final int NUM_NUMBERS = 5;
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(NUM_NUMBERS);

		setInputsToList(num);
		sort(num);
		printList(num);
	}
	
	private static void setInputsToList(ArrayList<Integer> list){
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < NUM_NUMBERS; i++){
			list.add(sc.nextInt());
		}
		
		sc.close();
	}
	
	private static void printList(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++){
			System.out.printf("%d", list.get(i));
			//ÅãÌvfðoÍµ½ãÍüs
			//»êÈOÌvfðoÍµ½ãÍXy[XðoÍ
			if(i != (list.size() - 1)){
				System.out.printf(" ");
			}
			else{
				System.out.printf("\n");
			}
		}
	}
	
	public  static void sort(ArrayList<Integer> list){
		int listSize = list.size();
		for(int i = listSize - 1; i > -1; i--){
			int pivot = list.get(i);
			for(int j = 0; j < i; j++){
				int target = list.get(j);
				if(target < pivot){
					list.set(j, pivot);
					list.set(i, target);
					pivot = target;
				}
			}
		}
	}
}