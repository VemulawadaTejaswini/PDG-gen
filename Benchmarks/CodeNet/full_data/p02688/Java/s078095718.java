import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int K = scan.nextInt();
			int []d = new int[K];
			int[][]A = new int[K][N];
			Map<Integer,ArrayList<Integer>>map = new TreeMap<Integer,ArrayList<Integer>>();
			
			for(int i = 0;i<N;i++) {
				map.put(i,new ArrayList<Integer>());
			}
			
			for(int i = 0;i<K;i++) {
				d[i] = scan.nextInt();//i番目のお菓子もらえる人数
				for(int j = 0;j<d[i];j++) {
					A[i][j] = scan.nextInt();//もらえる奴ら
					map.get(A[i][j]-1).add(i+1);
					
				}		
			}
			
			int count = 0;
			
			for(int i = 0;i<map.size();i++) {
				if(map.get(i).size()==0)count++;
				
				/*
				for(int j = 0;j<map.get(i).size();j++) {
					System.out.print(map.get(i).get(j));
				}
				System.out.println();
				*/
			}
			
			System.out.println(count);
			
		}
		
		
	}
		

}
