import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0;
            while ((line = br.readLine()) != null) {
            	if(line.equals("0 0")){
            		break;
            	}else{
            		String[] str=line.split(" ");
            		int a=Integer.parseInt(str[0]);
            		int b=Integer.parseInt(str[1]);
            		System.out.println(Integer.min(a,b)+" "+Integer.max(a, b));
            	}
            }
        }
    }
}