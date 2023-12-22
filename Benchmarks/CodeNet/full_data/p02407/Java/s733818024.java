import java.io.*;

class Main {
	public static void main(String[] args){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n];
			for(int i = 0;i < n;i++){
				a[i] = 0;
			}
			
			String[] line = br.readLine().split(" ");
			for(int i = 0;i < n;i++){
				int b = Integer.parseInt(line[i]);
				a[i] += b; 
			}
			for(int i = n-1; i >= 0;i--){
				System.out.print(a[i]+" ");
			}
		System.out.print("\n");	
		} catch(Exception e){
		}
	}
}