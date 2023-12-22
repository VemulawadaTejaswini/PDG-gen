import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] tmp = br.readLine().split(" ");
			int n = Integer.parseInt(tmp[0]);
			int x = Integer.parseInt(tmp[1]);
			if(n == 0 && x == 0){
				break;
			}
			int count = 0;
			for(int i = 3;i <= n;i++){
				for(int j = 2;j < i;j++){
					for(int k = 1;k < j;k++){
						if((i + j + k) == x){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}