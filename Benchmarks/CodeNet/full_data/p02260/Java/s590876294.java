import java.util.Scanner;

//implement the selection sort
public class Main {
	//helper functions
	public static void print_arr(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) {
				System.out.print(" ");
			}else {
				System.out.print("\n");
			}
			i++;
		}
	}
	
	
	public static int selection_sort(int[] arr) {
		int swap_times = 0;
		for(int i = 0; i< arr.length - 1; i++) {
			//choose the smallest element from a[i:];
			int min = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			if(min != i) {
				swap_times++;
				//do swap
				int tmp = arr[i];
				arr[i] = arr[min];
				arr[min] = tmp;
			}
		}
		return swap_times;
	}
	
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = cin.nextInt();
		}
		
		int swap_times = selection_sort(arr);
		print_arr(arr);
		System.out.println(swap_times);
		
		
	}

}