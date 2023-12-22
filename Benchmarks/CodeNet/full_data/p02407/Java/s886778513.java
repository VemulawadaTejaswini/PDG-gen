public class Main {
	public static void main (String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for(int i = 0;i < n; i++){
			arr[i] = scan.nextInt();
		}
		for(int i = (n-1);n >= 0;i--){
			System.out.print(arr[i] + " ");
		}
	}

}