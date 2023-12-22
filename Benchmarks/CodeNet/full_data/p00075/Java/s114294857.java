import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[3];
		while((str=br.readLine().split(",")) != null){
			if(check(Double.parseDouble(str[1]), Double.parseDouble(str[2])))
				System.out.println(str[0]);
		}
	}
	public static boolean check(double kg, double m){
		double bmi = kg/m*m;
		if(bmi>25)
			return true;
		else
			return false;
	}
}