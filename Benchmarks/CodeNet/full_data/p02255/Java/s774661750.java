import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> A = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for(int i=0;i<N;i++){
			A.add(scanner.nextInt());
		}
//		while(scanner.hasNext()){
//			A.add(scanner.nextInt());
//		}
		insertionSort(A,N);
	}
	static void insertionSort(ArrayList<Integer> A,int N){
		for(int i=1;i<N;i++){
			int v = A.get(i);
			int j=i-1;
			while(j>=0 && (v < A.get(j))){
				A.set(j+1,A.get(j));
				j--;
			}
			//??????????±????i????????????v??????j??????????????\??????????????????????????\?????????
			A.set(j+1, v);
			System.out.println(A);

		}
	}	
}