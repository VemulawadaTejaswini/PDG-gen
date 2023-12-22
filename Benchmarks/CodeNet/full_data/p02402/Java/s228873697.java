import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws Exception{
		long add=0;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String[] line2 = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(line1);
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(line2[i]);
			if(a[i] < min){
				min = a[i];
			}	if(a[i] > max){
				max = a[i];
			}
			add += a[i];
		}
		System.out.println(min+" "+ max+" "+ add);		
	}
}