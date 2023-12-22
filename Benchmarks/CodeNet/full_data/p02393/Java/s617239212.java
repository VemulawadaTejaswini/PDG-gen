import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] list = new int[3];
		list[0] = sc.nextInt();
		list[1] = sc.nextInt();
		list[2] = sc.nextInt();
		
		change(list);
		for (int i = 0; i < list.length; i++){
			System.out.print(list[i]);
			if (i == 2){
				continue;
			}
			System.out.print(" ");
		}
		System.out.println();
		
	}
	
	public static void change(int[] li){
		for (int j = 0; j < li.length - 1; j++){
			for (int i = 0; i < li.length - j - 1; i++){
				if(li[i] > li[i+1]){
					int tmp = li[i];
					li[i] = li[i+1];
					li[i+1] = tmp;
				}
			}
		}
	}
}