import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Classifier cf = new Classifier();
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			double input = Double.parseDouble(str);
			System.out.println(cf.className(input));
		}

	}

}

class Classifier {
	String[] classNames = {
			"light fly",
			"fly",
			"bantam",
			"feather",
			"light",
			"light welter",
			"welter",
			"light middle",
			"middle",
			"light heavy",
			"heavy"
	};
	
	double[] border = {0,48,51,54,57,60,64,69,75,81,91};
	
	String className(double w){
		for(int i = 0; i < border.length - 1 ; i++){
			if(w > border[i] && w <= border[i + 1]){
				return classNames[i];
			}
		}
		
		return classNames[classNames.length - 1];
	}
	
}