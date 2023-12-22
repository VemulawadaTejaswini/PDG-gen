import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exe  {
    public static void main (String[] args) {
    		try {
    			int i;
    			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
    			i = Integer.parseInt(d.readLine());
    			System.out.println(i*i*i);
    		}catch(IOException e){
    			
    		}
    }
}

