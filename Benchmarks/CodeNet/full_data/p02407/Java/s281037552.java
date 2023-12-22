import java.util.*; 

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		
		int n = cin.nextInt();
		ArrayLisy<Integer> arr=new ArrayList<>();
		
		for(int i=0;i<n;i++){
			arr.add=cin.nextInt();
		}
		
		Collections.reverse(arr);
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}

