import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Main {

	public static void main (String [] a){
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		ArrayList<String> days = new ArrayList<String>();
		
		try {
			while ((line = stdin.readLine()) != null && 
					line.length()!= 0 ) {
				
				try {
					String[] tempInput = line.split(" ");
					
					if (tempInput[0].equals("0") || tempInput[1].equals("0") ){
						break;
					}
					
					if (tempInput.length == 2){
						String tempDate = tempInput[0] + "/" + tempInput[1] + "/2004";
						String pattern = "EEEE";
					    SimpleDateFormat format = new SimpleDateFormat(pattern);
				        days.add(format.format(new Date(tempDate)));
					} else {
					}
					
				} catch (IllegalArgumentException e){
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}
			
			for (String s: days){
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
}