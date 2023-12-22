import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			int []H = new int[N];
			for(int i = 0;i<N;i++)H[i] = scan.nextInt();
			Map<Integer,ArrayList<Integer>> map = new TreeMap<Integer,ArrayList<Integer>>();
			
			for(int i =0;i<N;i++) {
				map.put(i, new ArrayList<Integer>());
			}
			
			int []A = new int[M];
			int []B= new int[M];
			
			for(int i = 0;i<M;i++) {
				A[i] = scan.nextInt();
				B[i] = scan.nextInt();
				map.get(A[i]-1).add(B[i]-1);
				map.get(B[i]-1).add(A[i]-1);
			}
			
			for(int i = 0;i<N;i++) {
				for(int j = 0;j<map.get(i).size();j++) {
					//System.out.print(map.get(i).get(j));
					//System.out.print(" ");
				}
				//System.out.println();
			}
			
			
			
			
			
			int count = 0;
			
			for(int i = 0;i<N;i++) {
				int ok = 1;
				for(int j = 0;j<map.get(i).size();j++) {
					if(H[map.get(i).get(j)]>=H[i]) {
						ok=0;
						break;
					}
				}
				if(ok==1)count++;
				//System.out.println(count);
			}
			
			System.out.println(count);
			
			
		}
		
		
	}
		

}
