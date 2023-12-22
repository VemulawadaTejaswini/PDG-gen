import java.io.BufferedReader;
import java.io.InputStreamReader;
//}ü\[g
//while¶Ì18Ítry-catchðüêÈ©Á½çA^CG[ªo½Ó¡s
//public class Problem0019_Factorial {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0019_Factorial test = new Problem0019_Factorial();
			Main test = new Main();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null) {
				try {
					int n = Integer.parseInt(line);
					test.showAnswer(n);
				} catch(Exception e) {
					break;
				}
			}
		
		/*	for(int i = 1; i < 21; i++) {
				System.out.print(i + ":\t");
				test.showAnswer(i);
			}
		*/
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void showAnswer(int max) {
		long answer = 1;
		for(int i = max; i > 0; i--) {
			answer = answer * i;
		}
		
		System.out.println(answer);
	}

}