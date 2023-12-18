
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] list = str.split(" ");
		int n = Integer.parseInt(list[0]);
		int m = Integer.parseInt(list[1]);
		String answer = "No";

		String[] a = new String[n];
		String[] b = new String[m];

		for(int i=0; i<n; i++){
			a[i] = input.readLine( );
		}
		for(int i=0; i<m; i++){
			b[i] = input.readLine( );
		}

		a:for(int i=0; i<n-m; i++){
			for(int j=0; j<m; j++){
				if(!(a[j].substring(i, i+m).equals(b[j]))){
					break;
				}
				if(j==n-m-1){
					answer = "Yes";
					break a;
				}
			}
		}
		System.out.println(answer);
	}
}
