import java.util.Scanner;

public class Main {
	private final static int LIST_MAX = 10;
	
	public static void main(String[]args){
		int Mt_list[];
		Mt_list = input();
		
		sort(Mt_list);
		
		show(Mt_list);
	}
	
	public static void show(int[] list){
		for(int i:list){
			System.out.println(i);
		}
	}
	
	public static int[] input(){
		Scanner stdIn = new Scanner(System.in);
		int list[] = new int[LIST_MAX];
		
		for(int i = 0;i < LIST_MAX;i++){
			list[i] = stdIn.nextInt();
		}
		
		stdIn.close();
		return list;
	}
	
	public static int[] sort(int[] list){
		for(int i = 0;i < LIST_MAX - 1;i++){
			for(int j = LIST_MAX - 1;j >= i + 1;j--){
				if(list[j - 1] < list[j]){
					int work = list[j - 1];
					list[j - 1] = list[j];
					list[j] = work;
				}
			}
		}
		return list;
	}
}