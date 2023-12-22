import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	double a=Double.parseDouble(str[0]);
            	double b=Double.parseDouble(str[1]);
            	double c=Double.parseDouble(str[2]);
            	double d=Double.parseDouble(str[3]);
            	System.out.println(Math.sqrt(Math.pow(c-a, 2)+Math.pow(d-b,2)));
            	break;
            }
        }
    }


}