import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			String str = br.readLine();
			String[] data = str.split(" ");
			int k = Integer.parseInt(data[0]);
			int p = Integer.parseInt(data[1]);
			if(p>k){
				System.out.println(k);
				continue;
			}
			else if(k%p==0){
				System.out.println(p);
			}
			System.out.println(k-(k/p)*p);
		}
	}
}