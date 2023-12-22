import java.io.BufferedReader;
import java.io.InputStreamReader;

public class itp1_4_d{
	public static void main(String[] args)throws Exception{
		int num=0,add=0;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String[] line2 = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(line1);
		int[] a = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(line2[i]);
			add += a[i];
		}
		
		for(int i=0; i<n-1; i++){
			for(int j=1;j<n; j++){
				if(a[i] > a[j]){
					num = a[i];
					a[i] = a[j];
					a[j] = num;
				}
			}
		}
		System.out.println(a[0]+" "+ a[n-1]+" "+ add);		
	}
}