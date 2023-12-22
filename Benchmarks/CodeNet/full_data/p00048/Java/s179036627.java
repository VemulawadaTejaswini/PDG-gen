import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while((str=br.readLine()) != null){
			double weight = Double.parseDouble(str);
			System.out.println(Judge(weight));
		}

	}

	static String Judge(double w){
		String weight="";
		if(w <= 48){
			weight="light fly";
		}else if(48<w && w<=51){
			weight="fly";
		}else if(51<w && w<=54){
			weight="bantam";
		}else if(54<w && w<=57){
			weight="feather";
		}else if(57<w && w<=60){
			weight="light";
		}else if(60<w && w<=64){
			weight="light welter";
		}else if(64<w && w<=69){
			weight="welter";
		}else if(69<w && w<=75){
			weight="light middle";
		}else if(75<w && w<=81){
			weight="middle";
		}else if(81<w && w<=91){
			weight="light heavy";
		}else if(91<w){
			weight="heavy";
		}
		return weight;
	}

}