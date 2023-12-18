import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] c = br.readLine().split(" "); 
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(c[i]);
			b[i] = a[i]%2;
		}
		/*
		boolean[] check = new boolean[n];
		for(int i=0; i<n; i++) {
			if(a[i]%2==0) {
				check[i] = true;
			}else{
				check[i] = false;
			}
		}*/
		int ch =0;
		
		for(int check=0; check<n; check++) {
			if(Arrays.asList(a).contains(1)) {
				break;
			}else {
				ch++;
				for(int i=0; i<n;i++) {
					a[i]=a[i]/2;
				}
			}
		}
		
	}
	
	
	
}