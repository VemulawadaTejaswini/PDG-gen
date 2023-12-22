import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = sc.nextInt();
		for(int i = 0; i < num; i++){
			list.add(sc.nextInt());
		}
		
		int size = list.size();
		
		int[] n = new int[size];
		n = sortList(list);
		
		for(int i = 0; i < size; i++){
			System.out.printf("%d", n[i]);
			if(i == (size - 1)){
				System.out.printf("\n");
			}
			else{
				System.out.printf(" ");
			}
		}
	}
	
	public static int[] sortList(ArrayList<Integer> list){
		int[] n = new int[list.size()];
		for(int i = 0; i < list.size(); i++){
			n[i] = list.get(i);
		}
		Arrays.sort(n);
		return n;
	}
}