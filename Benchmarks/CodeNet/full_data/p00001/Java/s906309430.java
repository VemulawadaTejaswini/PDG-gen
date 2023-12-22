import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;

class Main{
	public static void main(String[] a)throws ParseException{
		Integer[] mountainHeight = new Integer[10];
	for (int i = 0 ; i <= 9 ; i++) {
mountainHeight[i] = Integer.parseInt(a[i]);	
	}
	Arrays.sort(mountainHeight , Collections.reverseOrder());
	
	System.out.println(mountainHeight[0]);
	System.out.println(mountainHeight[1]);
	System.out.println(mountainHeight[2]);
	}
	
}