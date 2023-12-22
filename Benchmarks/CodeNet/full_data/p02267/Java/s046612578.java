import java.util.Scanner;


public class Main {
	
	public static int count(int[] sorted, int[] intSet) {
		
		int result = 0;
		
		for(int i = 0; i < intSet.length; i++) {
			
			for(int j = 0; j < sorted.length; j++) {
				
				if(intSet[i] == sorted[j]) {
					result++;
					break;
				}
			}
		}
		return result;
	}

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numSorted = in.nextInt();
		int[] sorted = new int[numSorted];
		
		for(int i = 0; i < numSorted; i++) {

			sorted[i] = in.nextInt();

		}
		
		int setNum = in.nextInt(); 
		int[] intSet = new int[setNum];

		for(int j = 0; j < setNum; j++) {

			intSet[j] = in.nextInt();

		}

		int result = count(sorted, intSet);

		System.out.println(result);


		in.close();
		
	}

}

