import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		//		String [][] boad = new String[4][4];
		int n = Integer.parseInt(sc.next());
		List <Integer> list = new ArrayList<Integer>();
//		int b = 0;
//		int c = 0;
		String d = null;
		if(n==23){
			d = "Christmas Eve Eve";
		}else if(n==24){
			d = "Christmas Eve";
		}else if(n==25){
			d = "Christmas";
		}else{
			d = "Christmas Eve Eve Eve";
		}
		System.out.println(d);
		System.out.flush();
		sc.close();
	}
}