
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] get = br.readLine().split("");
		int A = Integer.parseInt(get[0]);
		int B = Integer.parseInt(get[1]);
		int C = Integer.parseInt(get[2]);
		int D = Integer.parseInt(get[3]);


		for(int op1 = 0;op1<2;op1++){
			for(int op2 = 0;op2<2;op2++){
				for(int op3 = 0;op3<2;op3++){
					int ans = 0;
					String o1,o2,o3;
					if(op1 == 0){
						ans += A+B;
						 o1 = "+";
					}else{
						ans += A-B;
						o1 = "-";
					}

					if(op2 == 0){
						ans += C;
						 o2 = "+";

					}else{
						ans = ans-C;
						 o2 = "-";

					}

					if(op3 == 0){
						ans += D;
						o3 = "+";

					}
					else{
						ans = ans -D;
						o3 = "-";

					}

					if(ans == 7){
						System.out.println(A + o1 + B + o2 + C + o3 + D + "=7");
						System.exit(0);
					}
				}
			}
		}
	}
}
