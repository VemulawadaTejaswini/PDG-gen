import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su = Integer.parseInt(br.readLine());

		int num = 0;
		if((3 <= su) && (su <= 10000)){
			for(int i = 3; i <= su; i++){
				if((i % 3) == 0){
					System.out.print(" " + i);
				}else{
					num = i;
					while(num != 0){
						if((num % 10) == 3){
							System.out.print(" "+i);
							break;
						}
						break;
					}
				}
			}
		}
	}
}