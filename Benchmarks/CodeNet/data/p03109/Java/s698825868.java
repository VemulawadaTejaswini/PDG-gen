import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
	public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);

	String S=sc.next();
	SimpleDateFormat s=new SimpleDateFormat("yyyy/mm/dd");
	Date date1=s.parse(S);
	Date date=s.parse("2019/04/30");
	
	if(date1.before(date)) {
	System.out.print("Heisei");
	}
	else if(date1.after(date)) {
		System.out.print("TBD");
}
	
}
}