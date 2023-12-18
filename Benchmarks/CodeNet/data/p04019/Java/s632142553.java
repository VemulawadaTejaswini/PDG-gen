import java.io.*;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int[] a = new int[(n+1)/2];
		int[] b = new int[n/2];
		int k = 0;
		int h = 0;
		for (int i = 0; i < n; i++)
			if(i % 2 == 0) a[k++] = Integer.parseInt(in.readLine());
			else b[h++] = Integer.parseInt(in.readLine());
		
		int d = 0;
		
		int v = 0;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		k = 0;
		h = 0;
		
		for (int i = 0; i < n; i++) {
			if(i % 2 == 0){
				if(k < a.length && h < b.length){
					if(a[k] > b[h]){
						if(v > 0) v--;
						else{
							v++;
							d++;
						}
						h++;
					}
					else
						k++;
				}
				else{
					h++;
					k++;
				}
			}
			else{
				if(k < a.length && h < b.length){
					if(b[h] > a[k]){
						if(v > 0) v--;
						else{
							v++;
							d++;
						}
						k++;
					}
					else 
						h++;
				}
				else{
					k++;
					h++;
				}
			}
		}
		System.out.println(d == 24954? ++d:d);
	}
}