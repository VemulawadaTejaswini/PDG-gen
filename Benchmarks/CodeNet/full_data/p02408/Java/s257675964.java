
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputData;
        Map<String,String> cardMap = new HashMap<String,String>();
        String[] typeArray = {"S","H","C","D"};
        try {
        	int cardNum = Integer.parseInt(reader.readLine());
        	int cnt = 0;
        	//??\???
	        while(true){
				inputData = reader.readLine();
				cardMap.put(String.valueOf(cnt), inputData);
				cnt++;
	            if(cnt == cardNum){
	            	break;
	            }
	        }

	        //??????
	        for(int j=0;j<typeArray.length;j++){
		        for(int i=1 ;i < 14;i++){
		        	String checkString = typeArray[j]+" "+ i;
		        	if(!cardMap.containsValue(checkString)){
		        		System.out.println(checkString);
		        	}
		        }
	        }

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}