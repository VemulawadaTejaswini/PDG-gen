import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.valueOf(br.readLine());
		int B = Integer.valueOf(br.readLine());
		int C = Integer.valueOf(br.readLine());
		int D = Integer.valueOf(br.readLine());
		
		int Takahp = A;
		int Aokihp = C;
		int i = 0;
		while (i < 100 || Takahp <= 0 || Aokihp <= 0){
			Aokihp -= B;
			Takahp -= D;
			if(Aokihp <= 0) {
				System.out.println("Yes");
				break;
			}else if(Takahp == 0) {
				System.out.println("No");
				break;
			}else {
				i++;
			}
		}
		
	}
}