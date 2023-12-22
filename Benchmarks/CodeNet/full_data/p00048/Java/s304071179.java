import java.util.*;
import java.io.*;

public class Main{
	public static String judge(double w){
		if( w <= 48.0 ){
			return "light fly";
		} else if( w >= 48.0 && w <= 51.0 ){
			return "fly";
		} else if( w >= 51.0 && w <= 54.0 ){
			return "bantam";
		} else if( w >= 54.0 && w <= 57.0 ){
			return "feather";
		} else if( w >= 57.0 && w <= 60.0 ){
		 	return "light";
		} else if( w >= 60.0 && w <= 64.0 ){
			return "light welter";
		} else if( w >= 64.0 && w <= 69.0 ){
			return "welter";
		} else if( w >= 69.0 && w <= 75.0 ){
			return "light middle";
		} else if( w >= 75.0 && w <= 81.0 ){
			return "middle";
		} else if( w >= 81.0 && w <= 91.0 ){
			return "light heavy";
		} else {
			return "heavy";
		}
	}
	
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<String> result = new ArrayList<String>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				double w = stdIn.nextDouble();
				result.add(judge(w));
			}
			for(String str : result){
				System.out.println(str);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}