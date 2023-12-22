import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner k = new Scanner(System.in);
		int length = k.nextInt();
		//Convert from standard array indexing to starting from 1
		int[] array = new int[length+1];
		for(int x = 1; x <= length; x++) {
			array[x] = k.nextInt();
		}
		
		for(int i = 1; i <= length; i++) {
			System.out.print("node " + i + ": key = " + array[i] + ", ");
			
			if((i/2) > 0) {
				System.out.print("parent key = " + array[i/2] + ", ");
			}
			if((2*i) <= length) {
				System.out.print("left key = " + array[2*i] + ", ");
			}
			if((2*i+1) <= length) {
				System.out.print("right key = " + array[2*i+1] + ", ");
			}
			
			System.out.println("");
			
			
		}
		
		
		
	}

}

