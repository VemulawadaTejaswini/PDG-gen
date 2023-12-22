import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int length = scanner.nextInt();
		int A[] = new int[length];
        for(int i = 0; i < length; i++)
        	A[i] = scanner.nextInt();
        
        int key = 1000;
		int j = 1000;
		int count = 0;
		for (int i = 0; i < length; i++) {
			for (j = length-1; j>i; j--) {
				if (A[j] < A[j-1]){
					key = A[j-1];
					A[j-1] = A[j];
					count++;
					A[j] = key;
				}		
			}
		}
		out_put(A);
		System.out.println(count);	
	}
	
	private static void out_put(int A[]){
        System.out.printf("%d", A[0]);
        for(int i = 1; i < A.length; i++){
            System.out.printf(" %d", A[i]);
        }
        System.out.printf("\n");
    }
}
