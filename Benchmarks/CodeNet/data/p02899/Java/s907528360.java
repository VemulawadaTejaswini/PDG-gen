import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int ind;
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i <= n; i++){
			ind = find_index(i,arr,n);
			System.out.print(ind + " ");
		}
	}
	
	public static int find_index(int key, int[] arr, int n){
		for(int i = 0; i < n; i++){
			if(arr[i] == key){
				return i+1;
			}
		}
		return 0;
	}

	}