import java.util.*; 

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		
		int n = cin.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		
		for(int i=0;i<n;i++){
			int x=cin.nextInt();
			arr.add(x);
		}
		
		Collections.reverse(arr);
		
		for(int i=0;i<n;i++){
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}

}

