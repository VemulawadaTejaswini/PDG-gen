import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[2000000];
		int number = in.nextInt();
		
		for( int i = 0; i < number; i ++) {
			
			array[i] = in.nextInt();
		}
		
		int ans = calcMaxDiff(array, number);
		System.out.println(ans);
		}
	
		
		public static int calcMaxDiff(int[] NumsInArray, int n) {
			int maximum = NumsInArray[1] - NumsInArray[0];
			int minimum = NumsInArray[0];
			
			for(int i = 1; i < n; i++) {
				maximum = (maximum > NumsInArray[i] - minimum ? maximum : NumsInArray[i] - minimum);
				minimum = (minimum < NumsInArray[i] ? minimum : NumsInArray[i]);
			}
			return maximum;
		}
	}


