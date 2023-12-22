import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



		while(true){
			String str = br.readLine();
			String[] s = str.split(" ");

			int limit = Integer.parseInt(s[0]);
			int num= Integer.parseInt(s[1]);
			int count = 0;

			if((limit == 0)&&(num == 0)){
				break;
			}
			for(int i = 3; i <= limit; i++){
				for(int j = 2; j <= i; j++){
					for(int k = 1; k <= j; k++){
						if((i == j)||(j == k)||(k == i)){
							continue;
						}
						if((i + j + k)==num){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}