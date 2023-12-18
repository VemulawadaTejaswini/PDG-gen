import java.util.*;

public class Main {
	public static void main(String[] args) {
		int N = 0;
		int M = 0;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		int arr[] = new int[M];
		long arr2[] = new long[M];
		String arr3[] = new String[M];
		int flag[] = new int[N+1];
		
		long order[][] = new long[N+1][M];
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
			arr2[i] = scan.nextInt();
			
			order[arr[i]][flag[arr[i]]++] = arr2[i];
			
			
		}
		for (int i = 0; i < order.length; i++) {
				Arrays.sort(order[i]);
		}
		
//		for (int i = 0; i < order.length; i++) {
//			for (int j = 0; j < order[i].length; j++) {
//				System.out.print(order[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			switch (String.valueOf(arr[i]).length()) {
			case 1:
				result = "00000"+arr[i];
				break;
			case 2:
				result = "0000"+arr[i];
				break;
			case 3:
				result = "000"+arr[i];
				break;
			case 4:
				result = "00"+arr[i];
				break;
			case 5:
				result = "0"+arr[i];
				break;
			case 6:
				result = String.valueOf(arr[i]);
				break;
			
			}
			int after = 0;
			int temp1 = 0;
			for (int j = 0; j < order[arr[i]].length; j++) {
				if(0 == order[arr[i]][j]){
					temp1++;
				}else if(arr2[i] == order[arr[i]][j]){
					after = j+1-temp1;
					break;
				}
			}
			
			
			switch (String.valueOf(after).length()) {
			case 1:
				result += "00000"+after;
				break;
			case 2:
				result += "0000"+after;
				break;
			case 3:
				result += "000"+after;
				break;
			case 4:
				result += "00"+after;
				break;
			case 5:
				result += "0"+after;
				break;
			case 6:
				result += String.valueOf(after);
				break;
			
			}
			
			System.out.println(result);
		}
		
	}
}
