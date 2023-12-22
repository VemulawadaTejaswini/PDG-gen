
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args){
		ArrayList<Integer> A = new ArrayList<Integer>();
		//input
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=0;i<N;i++){
			A.add(scanner.nextInt());
		}
		makeOutputString(A,N);
		insertionSort(A,N);
		//output
		System.out.println(builder);
	}
	
	static void insertionSort(ArrayList<Integer> A,int N){
		for(int i=1;i<N;i++){
			int v = A.get(i);
			int j=i-1;
			while(j>=0 && (v < A.get(j))){
				A.set(j+1,A.get(j));
				j--;
			}
			//this is the reason called a "InsertionSort"
			A.set(j+1, v);
			makeOutputString(A,N);
		}
	}
	static void makeOutputString(ArrayList<Integer> A,int N){
		for(int i=0;i<N;i++){
			if(i>0){
				builder.append(" ");
			}
			builder.append(A.get(i));
		}
		builder.append("\n");
	}
}