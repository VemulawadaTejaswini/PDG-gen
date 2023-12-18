import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		Date dayz = date.parse(day); 
	
		Date d = new Date(2019/04/30);
	
		
		if(dayz.before(d)) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}
		
	}

}
