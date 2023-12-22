import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputData;
            StringBuilder sb = new StringBuilder();
            int i = 0;
	            while(true){
	            i++;
	            inputData = reader.readLine();
	            if("0".equals(inputData)){
	            	break;
	            }else{
	            	sb.append("Case " + i + ": " + inputData + System.getProperty("line.separator"));
	            }
            }
            System.out.println(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}