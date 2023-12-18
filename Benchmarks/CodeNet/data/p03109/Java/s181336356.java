import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) throws ParseException{
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	String S = sc.next();
      	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
      	 Date formatDate = sdf.parse(S);
      	Date theDate = new Date(2019, 5, 1, 00, 00, 00);
      	boolean result = theDate.after(formatDate);
      	if(!result){
	        System.out.println("TBD");
        }else{
        	System.out.println("Heisei");
        }
      	
      
    }
}