import java.util.*;


public class Main {
	static boolean stability = true;
	
	public static int partition(String [] arr, int left, int right) {
		int pivot = Integer.parseInt(arr[right].substring(2));
		int i = left - 1;
		
		
		for(int j = left; j < right; j++) {
			if(Integer.parseInt(arr[j].substring(2)) <= pivot) {
				
				i++;
				
				
				String tempS = arr[j].substring(0, 2);
				int temp = Integer.parseInt(arr[j].substring(2));
				arr[j] = arr[i];
				arr[i] = tempS + temp;		
			}	
		}
		String tempS = arr[i + 1].substring(0, 2);
		int temp = Integer.parseInt(arr[i + 1].substring(2));
		
		
		arr[i + 1] = arr[right];
		arr[right] = tempS + temp;
		return i + 1;
	}
	
	public static void sort(String [] arr, int left, int right) {
		if(left < right) {
			int mid = partition(arr, left, right);
			sort(arr, left, mid - 1);
			sort(arr, mid + 1, right);
		}
	}
public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int n = Integer.parseInt(in.nextLine());
		String [] arr = new String [n];
		Map<String, Integer> order = new HashMap<String, Integer>();
		
		for(int i = 0; i < n; i++) {
			String s = in.nextLine();
			arr[i] = s;
			order.put(s, i);
		}
		
		sort(arr, 0, n - 1);
		
		for(int i = 0; i < n - 1; i++) {
			if(Integer.parseInt(arr[i].substring(2)) == Integer.parseInt(arr[i + 1].substring(2)) && 
					order.get(arr[i]) > order.get(arr[i + 1])) {
				stability = false;
			}
		}
		
		if(stability) {
			System.out.println("Stable");
		}
		
		else {
			System.out.println("Not stable");
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			
		}
		
		
}
}

