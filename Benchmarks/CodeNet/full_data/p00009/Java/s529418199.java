import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean jud[] = new boolean[100000];
		jud[0] = false;
		jud[1] = false;
		int cnt = 0;
		int prim[] = new int[100000];
		
		for(int i= 2;i<100000;i++){
			jud[i] = true;
		}
		
		for(int i = 2;i<100000;i++){
			for(int j = i*2;j<100000;j+=i){
				jud[j] = false;
			}
			if(jud[i]) cnt++;
			prim[i] = cnt;
		}
		
		String s = "";
		while((s = br.readLine()) != null){
			int input = Integer.parseInt(s);
			System.out.println(prim[input]);
		}
	}
}