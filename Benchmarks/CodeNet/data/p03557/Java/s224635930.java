import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int n = Integer.parseInt(str1);
		
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(tmpArray[i]);
		}
		
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			b[i] = Integer.parseInt(tmpArray[i]);
		}
		
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			c[i] = Integer.parseInt(tmpArray[i]);
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		long result = 0;
		
		int[] bc = new int[n];
		
		for(int i = 0; i < n; i++){
			for(int j = n - 1; j >= 0; j--){
				if(b[i] < c[j]){
					bc[i]++;
				}
				else {
					break;
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			long tmp = 0;
			for(int j = n - 1; j >= 0; j--){
				if(a[i] < b[j]){
					tmp += bc[j];
				}
				else {
					break;
				}
			}
			result += tmp;
		}
//		//素朴法
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n; j++){
//				if(a[i] >= b[j]){
//					continue;
//				}
//				for(int k = n - 1; k >= 0; k--){
//					if(b[j] < c[k]){
//						result++;
//					}
//					else {
//						break;
//					}
//				}
//			}
//		}
		
		System.out.println(result);
	}

}
