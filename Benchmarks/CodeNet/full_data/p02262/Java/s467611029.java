import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Scanner as = new Scanner(System.in);
		Sort sort = new Sort();
		
		int cnt = 0;
		int m = 0;
		int h = 0;
		int n = 0;
		int j = 0;
		int G[];
		int A[];
		
		n = Integer.parseInt(as.next());
		
		A = new int[n];
		
		for(int i=0;i<n;i++){
			
			A[i] = Integer.parseInt(as.next());
			
		}
		
		h = (n/2);
		
		if(h == 0){
			
			G = new int[h+1];
			
		}
		else{
			
			G = new int[h];
			
		}
			
			
		G[0] = 1;
		
		for(int i=1;i<h;i=i*3+1){
			
			G[j] = i;
			j++;
			
		}
		
		if(j == 0){
			
			m = 1;
			
		}
		else{
			
			m = j;
			
		}
		
		for(int i=0;i<=m-1;i++){
			
			ReturnValues value = sort.insertionSort(A, n, G[j-i-1]);
			cnt += value.count;
			A = value.A;
			
		}
		
		sb.append(m);
		System.out.println(sb.toString());
		sb.setLength(0);
		for(int i=0;i<m;i++){
			
			if(i == m-1){
				
				sb.append(G[j-i-1]);
				
			}
			else{
			
				sb.append(G[j-i-1]).append(' ');
			
			}
		}
		
		System.out.println(sb.toString());
		sb.setLength(0);
		sb.append(cnt);
		System.out.println(sb.toString());
		sb.setLength(0);
		for(int i=0;i<n;i++){
			
			sb.append(A[i]);
			System.out.println(sb.toString());
			sb.setLength(0);
			
		}

	}

}

class Sort{
	
	public static ReturnValues insertionSort(int[] A,int n, int g){
		
		int v = 0;
		int j = 0;
		int count = 0;
		
		for(int i=g;i<=n-1;i++){
			
			v = A[i];
			j = i - g;
			
			while(j >= 0 && A[j] > v){
				
				A[j + g] = A[j];
				j = j - g;
				count++;
				
			}
		
			A[j + g] = v;
			
		}
		
		ReturnValues value = new ReturnValues();
		value.A = A;
		value.count += count;
		
		return value;
		
	}
	
}

class ReturnValues{
	
	public int count;
	public int A[];
	
}