import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
public class Main{
	public static void main(String[] args) throws IOException {
		Locale lo = new Locale("ja","JP","JP");
		SimpleDateFormat sdf = new SimpleDateFormat("Gy", lo);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[3];
		int[] data = new int[3];
		while((str = br.readLine().split(" "))!=null){
			for(int i = 0 ; i < 3 ; i ++){
				data[i] = Integer.parseInt(str[i]);
			}
			Calendar cal = Calendar.getInstance();
		    cal.add(Calendar.YEAR, -(2014-data[0]));
		    str[0] = sdf.format(cal.getTime());
		    if(str[0].charAt(0)=='H'){
		    	System.out.print("heisei");
		    }
		    else if(str[0].charAt(0)=='S'){
		    	System.out.print("showa");
		    }
		    else if(str[0].charAt(0)=='T'){
		    	System.out.print("taisho");
		    }
		    else if(str[0].charAt(0)=='M'){
		    	System.out.print("meiji");
		    }
		    else{
		    	System.out.println("pre-meiji");
		    	continue;
		    }
		    System.out.println(" "+str[0].substring(1)+" "+data[1]+" "+data[2]);
		    str = new String[3];
		    data = new int[3];
		}
	}
}