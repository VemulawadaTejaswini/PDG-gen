import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int sequenceNumber = Integer.parseInt(sc.next());
		
		int argments[] = new int[sequenceNumber];
		
		for(int i = 0;i<argments.length;i++){
			
			argments[i] = Integer.parseInt(sc.next());
			
		}
		int min = min(argments);
		int max = max(argments);
		long sum = sum(argments);
		
		System.out.println(min +" " + max + " " + sum);
		
		sc.close();
	}

	private static long sum(int[] argments) {
		
		long sum = 0;
		for(int i = 0;i<argments.length;i++){
			
			sum += argments[i];
			
		}
		
		return sum;
	}

	private static int max(int[] argments) {
		
		int max = argments[0];
		for(int i = 1;i<argments.length;i++){
			
			if(max < argments[i]){
				max = argments[i];
			}
		}
		
		
		return max;
	}

	private static int min(int[] argments) {
		
		int min = argments[0];
		for(int i = 1;i<argments.length;i++){
			
			if(min > argments[i]){
				min = argments[i];
			}
		}
		
		
		return min;
	}

}
