import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		int MAX = 100000;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		int[] prime = new int[MAX + 1];
		int i = 0;
		
		try {
			//エラトステネスの篩
			for(i = 2; i * i <= MAX; i++ ){
		      if(prime[i] == 1 ) continue ;
		      for(int j = i * 2; j <= MAX; j += i ) prime[j] = 1;
		    }
			for(i = 2; i <= MAX; i++ ) 
				prime[i] = prime[i - 1] + (prime[i] == 0 ? 1 : 0);
			
			while ((line = br.readLine()) != null) {
				line = line.trim();
				int num = Integer.parseInt(line);
				if (num < 0 || num >= MAX)System.exit(-1);
					
				System.out.println(prime[num]);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}