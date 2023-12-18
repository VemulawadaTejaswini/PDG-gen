import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		
		System.out.println(countOceanView(arr));
	}
	
	private static int countOceanView(int[] arr) {
		
		int ans = 1;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] >= arr[i - 1]) ans++;
			arr[i] = Math.max(arr[i], arr[i - 1]);
		}
		
		return ans;
	}
}