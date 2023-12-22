import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static double x;
    private static double max;
    private static double min;
    private static String val;
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        max=0;
        min=0;
        while((val = br.readLine()) != null){
        	x = Double.parseDouble(val);
          	if(x > max){
           		max=x;
           	}
           	if(x < min){
           		min=x;
           	}
        }
        System.out.println(max-min);
    }
}