import java.util.ArrayList;
import java.util.Scanner;

 class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0 ;
		int arr[] = new int[n]; 
		for(int i = 0 ; i< n ;i++) {
			arr[i] = scan.nextInt();
		}
		
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 1 ; i <n-1 ; i++) {
			if(!a.contains(Second(arr[i-1],arr[i],arr[i+1]))){
				a.add(Second(arr[i-1],arr[i],arr[i+1]));
				
			}
		}
		System.out.print(a.size());

		
	}

	static int Second(int a , int b , int x) {
		int first = a  , second = b ;

			if(second < first ) {
				first = b ; 
				second = a ;
			}
			if(x < second ) {
				second = x  ;
			}
			if(second < first ) {
				int temp = first ;
				first = second ;
				second = temp ;
			}
		return second ;
		
	}
}
