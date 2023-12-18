import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] cache;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		cache=new int[318];
		for(int i=0;i<318;i++)
			cache[i]=(i+1)*(i+1);
		
		int cnt=0;
		while(N>0) {
			int per=-1;
			for(int i=0;i<318;i++) 
				if(cache[i]>N) {
					per=cache[i-1];
					break;
				}
			N=N-per;
			cnt++;
		}
		
		System.out.println(cnt);
	}

}
