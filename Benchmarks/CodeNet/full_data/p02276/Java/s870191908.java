//API???????????????
import java.io.IOException;
import java.util.Scanner;
class Main {
  	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];
		
		for(int i = 0; i < n; i++){
			A[i] = scan.nextInt();
		}
		
		int pivot = Partition(A, 0, n);
		
		for(int i = 0; i < n; i++){
			if(i == pivot){
				System.out.print("[" + A[i] + "]" + " ");
			}else if(i != n - 1){
				System.out.print(A[i] + " ");
			}else{
				System.out.println(A[i]);
			}
		}
	}
	
	public static int Partition(int[] A, int l, int r){
		int threshold = A[r - 1];
		int i = l - 1;
		for(int j = l; j < r - 1; j++){
			if(A[j] <= threshold){
				i++;
				exchange(A, i, j);
			}
		}
		i++;
		exchange(A, i, r - 1);
		
		return i;
	}
		
	public static void exchange(int[] A, int i, int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
} 