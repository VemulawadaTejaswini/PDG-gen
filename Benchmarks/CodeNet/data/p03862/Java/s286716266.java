
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strnx = str.split(" ");
		int n = Integer.parseInt(strnx[0]);
		int x = Integer.parseInt(strnx[1]);
		str = input.readLine( );
		String[] list = str.split(" ");
		int[] a = new int[n];

		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(list[i]);
		}

		int count = 0;

		for(int i=0; i<n-1; i++){
			while(a[i]+a[i+1] > x){
				if(a[i+1]>0){
					a[i+1] = a[i+1] - 1;
				}else{
					a[i] = a[i] - 1;
				}
				count = count + 1;
			}
		}

		System.out.println(count);
	}
}
