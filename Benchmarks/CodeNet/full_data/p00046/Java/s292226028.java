import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

	    double max = Double.MAX_VALUE;
	    double min = Double.MIN_VALUE;
	    double tmp = Double.MIN_VALUE;
	    
        while((str = br.readLine()) != null ){

        	tmp = Double.parseDouble(str);

        	if(tmp>max){
        		max=tmp;
        	}
        	else if(tmp<min){
        		min=tmp;
        	}
        }
        System.out.println(max-min);

	}
	

}