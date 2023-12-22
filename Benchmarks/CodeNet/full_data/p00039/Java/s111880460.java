import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			out.println(RomanToArabic(sc.next()));
		}
	}
	static int RomanToArabic (String s) {
		String[] a = {"IV","IX","XL","XC","CD","CM"};
		String[] b = {"IIII","VIIII","XXXX","LXXXX","CCCC","DCCCC"};
		for (int j=0; j<6; j++) {
			s = s.replaceAll(a[j],b[j]);
		}
		int n = 0;
		int[] number = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] roma = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for (int i=0; i<s.length(); i++) {
			for (int j=0; j<13; j++) {
				if (s.substring(i,i+1).equals(roma[j])) {n += number[j];}
			}
		}
		if (n > 3999) {return -1;}
		else {return n;}
	}

}
