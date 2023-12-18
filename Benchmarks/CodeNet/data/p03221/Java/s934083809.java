import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N,M;
	static int[][] cityArr;
	static int[][] setArr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		cityArr = new int[M][2];
		setArr = new int[N][M+1];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int xq =  Integer.valueOf(st.nextToken());
			int year =  Integer.valueOf(st.nextToken());
			cityArr[i][0] = xq;
			cityArr[i][1] = year;
			
			setArr[xq-1][0]++;
			
			setArr[xq-1][setArr[xq-1][0]] = year;
		}
		
		//sort
		for(int i=0;i<N;i++) {
			int dataCount = setArr[i][0];
			if(dataCount > 0) {//have data
				int tempArr[] = setArr[i];
				for(int j=1;j<=dataCount;j++) {
					for(int k=1;k<=dataCount;k++) {
						if(tempArr[k]>tempArr[j]) {
							int temp = tempArr[j];
							tempArr[j] = tempArr[k];
							tempArr[k] = temp;
						}
					}
				}
			}
		}
		
		for(int i=0;i<M;i++) {
			int qy = cityArr[i][0];
			int year = cityArr[i][1];
			
			int arr[] = setArr[qy-1];
			
			for(int j=1;j<=arr.length;j++) {
				if(arr[j]==year) {
					System.out.println(String.format("%06d", qy)+String.format("%06d", j));
					break;
				}
			}
		}
		
	}
	
}
