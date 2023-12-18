import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			int[][]B = new int[N][N];
			int[]K = new int[N];//値
			for(int i= 0;i<N;i++) {
				A[i] = scan.nextInt();
			}
			
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			
			for(int i = 0;i<N;i++) {
				if(map.containsKey(A[i])) {
					map.put(A[i], map.get(A[i])+1);
					//System.out.println("ok");
				}else{
					map.put(A[i], 1);
					//System.out.println("no");
				}
			}
			
			/*for(Integer key:map.keySet()) {
				System.out.println(key);
				System.out.println(map.get(key));
			}*/
			//int n = 1_000_000; //n=100万まで求めるとする
	        //pre_factorials(n); //1!からn!までの値を持った配列を準備する    
			
			
			for(int i= 0;i<N;i++) {
				int goukei =0;
				//if(map.get(A[i])>1) {
				
				for(Integer key:map.keySet()) {
					if(map.get(key)>1)
						goukei+=sa(map.get(key),2);
				}
				
				
				if(map.get(A[i])>1) {
					goukei-=sb(map.get(A[i])-1,1);
					System.out.println(goukei);
				}else {
					System.out.println(goukei);
				}
				
			
				
				
					
				
				
			}
			
			
			
			
			
			
			
		}
		
		
	}
	
	private static int sa(int n,int b) {
		return n*(n-1)/b;
	}
	
	private static int sb(int n,int b) {
		return n;
	}
  
}