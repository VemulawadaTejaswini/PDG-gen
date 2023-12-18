import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N,M;
	static City[] arr;
	static int[][] cityArr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		arr = new City[M]; 
		cityArr = new int[N][M];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			
			int P = Integer.valueOf(st.nextToken());
			int Y = Integer.valueOf(st.nextToken());
			arr[i] = new City(P,Y);
			
			cityArr[P-1][i] = Y;
			
		}
		
		for(int i=0;i<N;i++) {
			int[] ar = cityArr[i];
			for(int k=0;k<ar.length;k++) {
				for(int j=0;j<ar.length;j++) {
					if(ar[k]<ar[j]) {
						int tmp = ar[k];
						ar[k] = ar[j];
						ar[j] = tmp;
					}
				}
			}
		}
		
		for(int i=0;i<M;i++) {
			City city = arr[i];
			int arr[] = cityArr[city.xq-1];
			int zeroCount =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==0) {
					zeroCount++;
				}
				if(arr[j]==city.year) {
					System.out.println(String.format("%06d", city.xq)+String.format("%06d", j-zeroCount+1));
				}
			}
		}
	}
	
	public static class City{
		private int xq;
		private int year;
		
		public City(int xq, int year) {
			super();
			this.xq = xq;
			this.year = year;
		}
		
	}

}
