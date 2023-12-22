import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = sc.nextInt();
		for(int i = 0; i < num; i++){
			list.add(sc.nextInt());
		}
		
		sortList(list);
		
		int size = list.size();
		
		for(int i = 0; i < size; i++){
			System.out.printf("%d", list.get(i));
			if(i == (size - 1)){
				System.out.printf("\n");
			}
			else{
				System.out.printf(" ");
			}
		}
	}
	
	public static void sortList(ArrayList<Integer> list){
		int size = list.size();
		for(int i = 0; i < size; i++){
			for(int j = size - 1; i < j; j--){
				int valueOfI = list.get(i);
				int valueOfJ = list.get(j);
				if(j < i){
					list.set(i, j);
					list.set(j, i);
				}
			}
		}
	}
}