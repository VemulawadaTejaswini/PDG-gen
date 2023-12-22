import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double f , x , h;
        try{
        	String list = br.readLine();
        	x = Integer.parseInt(list);
        	DecimalFormat df = new DecimalFormat("0.000000");
        	f = x * x * Math.PI;
        	h = 2 * x * Math.PI;
            System.out.println(df.format(f) + " " + df.format(h));
        }
        catch(IOException e){
        	e.printStackTrace();
        }
	}

}