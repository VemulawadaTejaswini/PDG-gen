package AizuOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class SimultaneousEquation {
	public class UnknowNumbers{
		float x;
		float y;
	}

	public UnknowNumbers formula(float para_a, float para_b, float para_c, float para_d, float para_e, float para_f){
		UnknowNumbers numbers = new UnknowNumbers();

		if(para_a == 0){
			numbers.y = para_c / para_b;
			numbers.x = ((para_b * para_f) - (para_c * para_e)) / (para_d * para_b);

		} else if((para_a * para_e) - (para_d * para_b) == 0){
			System.out.println("The parallel lines!!!");
			System.exit(0);
		} else{
			numbers.y = ((para_a * para_f) - (para_d * para_c)) / ((para_a * para_e) - (para_d * para_b));
			numbers.x = (para_c - para_b * numbers.y) / para_a;
		}
		return numbers;
	}
	public static int main(String[] args){

		SimultaneousEquation equation = new SimultaneousEquation();
		UnknowNumbers numbers;
		String[] strParameters;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		while(true){
			try{
				String buf = br.readLine();
				if(buf == null) break;
				strParameters = buf.split(" ");
			}catch(Exception e){
				System.out.print(e);
				break;
			}

			float[] parameters = new float[strParameters.length];

			for(int iPara = 0; iPara < strParameters.length; iPara++){
				parameters[iPara] = Float.parseFloat(strParameters[iPara]);
			}
			numbers = equation.formula(parameters[0],parameters[1],parameters[2],parameters[3],parameters[4],parameters[5]);
			System.out.printf("%.3f %.3f\n",numbers.x,numbers.y);
		}
		return 0;
	}
}