import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int joi=0,ioi=0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null&&line.length()!=0) {
            	joi=0;
            	ioi=0;
            	for(int i=0;i<line.length()-3;i++){
            		if(line.substring(i,i+3).equals("JOI")){
            			joi++;
            		}else if(line.substring(i,i+3).equals("IOI")){
            			ioi++;
            		}
            	}
            	System.out.println(joi);
            	System.out.println(ioi);
            }
         }
	}

}