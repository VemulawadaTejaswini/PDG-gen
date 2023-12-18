import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(in.readLine());
		
		int c = 0;
		
		while(true){
			boolean o = false;
			for (int i = 0; i < a.length; i++) {
				if(i <= a.length - 3){
					if(a[i] > a[i+2]){
						int temp = a[i];
						a[i] = a[i + 2];
						a[i+2] = temp;
						o = true;
					}
					else if(a[i] > a[i+1]){
						int temp = a[i];
						a[i] = a[i + 1];
						a[i+1] = temp;
						c++;
						o = true;
					}
				}
				else if(i <= a.length - 2 && a[i] > a[i+1]){
					int temp = a[i];
					a[i] = a[i + 1];
					a[i+1] = temp;
					c++;
					o = true;
				}
			}
			
			if(!o) break; else continue;
		}
		
		System.out.println(c);
	}
}
