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
            	double s=a*b*Math.sin(Math.PI*c/180)/2;
            	System.out.println(s);
            	System.out.println(a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.PI*c/180)));
            	System.out.println(2*s/a);
            	break;
            }
        }
    }


}