import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] cache;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] inputs=br.readLine().split(" ");
		int a=Integer.parseInt(inputs[0]);
		int b=Integer.parseInt(inputs[1]);
		cache=new int[999];
		cache[0]=1;
		for(int i=1;i<999;i++)
			cache[i]=cache[i-1]+(i+1);
		
		int result=-1;
		for(int i=0;i<999;i++)
			if(a<cache[i]) {
				result=cache[i]-a;
				break;
			}
		
		System.out.println(result);
	}

}
