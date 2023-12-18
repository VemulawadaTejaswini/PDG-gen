import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt() - i - 1;
		
		Arrays.sort(A);
		ArrayList<Integer[]> AA = new ArrayList<Integer[]>();
		Integer[] a = {A[0], 1};
		AA.add(a);
		for(int i = 1; i < N; i++){
			if(AA.get(AA.size()-1)[0] == A[i]){
				Integer[] newa = {A[i], AA.get(AA.size()-1)[1]+1};
				AA.remove(AA.size()-1);
				AA.add(newa);
			}else{
				Integer[] newa = {A[i], 1};
				AA.add(newa);
			}
		}
		
		int min = 0;
		int b = AA.get(0)[0];
		for(int i = 1; i < AA.size(); i++){
			min += (int)(Math.abs(b - AA.get(i)[0])) * AA.get(i)[1];
		}
		
		for(int i = 1; i < AA.size(); i++){
			int bb = AA.get(i)[0];
			int num = 0;
			for(int j = 0; j < AA.size(); j++){
				if(i != j) num += (int)(Math.abs(bb - AA.get(j)[0])) * AA.get(j)[1];
			}
			if(num < min) min = num;
		}
		
		System.out.println(min);
	}
}