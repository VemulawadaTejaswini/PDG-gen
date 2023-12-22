import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while((str=br.readLine()) != null){
			int n = Integer.parseInt(str);
			int count = 0;
			int yakusu;

			for(int i=1; i<=n; i++){
				yakusu=0;
				for(int j=1; j<=i; j++){
					if(i%j==0){
						yakusu++;
					}
				}
				if(yakusu==2)
					count++;
			}
			System.out.println(count);
		}
	}
}