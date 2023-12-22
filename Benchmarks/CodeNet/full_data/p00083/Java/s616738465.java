import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while((input = br.readLine()) != null){
			String[] v = input.split(" ");
			int year = Integer.parseInt(v[0]);
			int month = Integer.parseInt(v[1]);
			int date = Integer.parseInt(v[2]);
			String era = transToEra(new GregorianCalendar(year, month, date));
			System.out.println(era + ((era.contains("pre-meiji"))? "": " " + month + " " + date));
		}
	}

	public static String transToEra(GregorianCalendar date){
		GregorianCalendar startMeiji = new GregorianCalendar(1868, 9, 8);
		GregorianCalendar endMeiji = new GregorianCalendar(1912, 7, 29);
		GregorianCalendar startTaisho = new GregorianCalendar(1912, 7, 30);
		GregorianCalendar endTaisho = new GregorianCalendar(1926, 12, 24);
		GregorianCalendar startShowa = new GregorianCalendar(1926, 12, 25);
		GregorianCalendar endShowa = new GregorianCalendar(1989, 1, 7);
		GregorianCalendar startHeisei = new GregorianCalendar(1989, 1, 8);
		if(date.before(startMeiji)){
			return "pre-meiji";
		}else if(date.before(startTaisho)){
			return "meiji " + ((date.getTimeInMillis() - startMeiji.getTimeInMillis())/1000/(60*60*24*365) + 1);
		}else if(date.before(startShowa)){
			return "taisho " + ((date.getTimeInMillis() - startTaisho.getTimeInMillis())/1000/(60*60*24*365) + 1);
		}else if(date.before(startHeisei)){
			return "showa " + ((date.getTimeInMillis() - startShowa.getTimeInMillis())/1000/(60*60*24*365) + 1); 
		}else{
			return "heisei " + ((date.getTimeInMillis() - startHeisei.getTimeInMillis())/1000/(60*60*24*365) + 1);
		}
	}
}