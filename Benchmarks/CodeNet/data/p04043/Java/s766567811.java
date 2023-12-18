import java.util.*;
class Main /*atcoder beginner contest 42*/{
	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			int[] arr = new int[19];
			int a  = s.nextInt() ; 
			arr[a]++;
			a = s.nextInt() ; 
			arr[a]++;
			a  = s.nextInt();
			arr[a]++;

			if(arr[5] == 2 && arr[7] == 1)
				System.out.println("YES");
			else
				System.out.println("NO");

	}
}