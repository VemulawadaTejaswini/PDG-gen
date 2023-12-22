import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while((input = br.readLine()) != null){
			String[] v = input.split(" ");
			int year = Integer.parseInt(v[0]);
			int month = Integer.parseInt(v[1]);
			int date = Integer.parseInt(v[2]);
			String era = transToEra(new Date(year,month,date));
			System.out.println(era + ((era.contains("pre-meiji"))? "": " " + month + " " + date));
		}
	}

	public static String transToEra(Date date){
		Date startMeiji = new Date(1868, 9, 8);
		Date endMeiji = new Date(1912, 7, 29);
		Date startTaisho = new Date(1912, 7, 30);
		Date endTaisho = new Date(1926,12,24);
		Date startShowa = new Date(1926, 12, 25);
		Date endShowa = new Date(1989, 1, 7);
		Date startHeisei = new Date(1989,1,8);
		long time = date.getTime();
		if(time < startMeiji.getTime()){
			return "pre-meiji";
		}else if(time <= endMeiji.getTime()){
			return "meiji " + (date.getTime() - startMeiji.getTime())/1000/(60*60*24*365) + 1;
		}else if(time <= endTaisho.getTime()){
			return "taisho " + (date.getTime() - startTaisho.getTime())/1000/(60*60*24*365) + 1;
		}else if(time <= endShowa.getTime()){
			return "showa " + (date.getTime() - startShowa.getTime())/1000/(60*60*24*365) + 1; 
		}else{
			return "heisei " + (date.getTime() - startHeisei.getTime())/1000/(60*60*24*365) + 1;
		}
		
	}
}