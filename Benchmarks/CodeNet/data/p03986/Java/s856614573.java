import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


	public void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		/*String[] data = line.split("");
		for(int i=0; i<data.length; i++){
			//String.valueOf(firestLine.charAt(i));
		}*/
		for(int i=0; i<1010000;i++){
			line = line.replace("ST", "");
		}
		System.out.println(line.length());
	}
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}