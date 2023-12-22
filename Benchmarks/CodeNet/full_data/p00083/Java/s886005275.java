import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
public class Main{
	public static void main(String[] args) throws IOException {
		Locale lo = new Locale("ja","JP","JP");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("Gy", lo);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[3];
		int[] data = new int[3];
		while((str = br.readLine().split(" "))!=null){
			for(int i = 0 ; i < 3 ; i ++){
				data[i] = Integer.parseInt(str[i]);
			}
		    cal.add(Calendar.YEAR, -(2014-data[0]));
		    str[0] = sdf.format(cal.getTime());
		    if(str[0].charAt(0)=='H'){
		    	System.out.print("heisei");
		    }
		    else if(str[0].charAt(0)=='S'){
		    	System.out.print("showa");
		    }
		    else if(str[0].charAt(0)=='H'){
		    	System.out.print("taisho");
		    }
		    else if(str[0].charAt(0)=='H'){
		    	System.out.print("meiji");
		    }
		    System.out.println(" "+str[0].substring(1)+" "+data[1]+" "+data[2]);
		}
	}
}