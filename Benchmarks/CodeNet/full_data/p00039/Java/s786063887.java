import java.util.Scanner;
import java.util.HashMap;
public class Main {
    static HashMap<String, Integer> romanMap;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	romanMap = new HashMap<String, Integer>();
	String[] romanArray = {"I", "V", "X", "L", "C", "D", "M"};
	int[] arabianArray = {1, 5, 10, 50, 100, 500, 1000};
	for (int i = 0; i < 7; i++) {
	    romanMap.put(romanArray[i], arabianArray[i]);
	}

	String roman;
	while (scan.hasNext()) {
	    roman = scan.nextLine();
	    System.out.println(solv(roman));
	}
    }

    static int solv (String roman) {
	int prev, now, sum = 0;
	prev = romanMap.get(roman.substring(0, 1));
	sum += prev;
	for (int i = 1; i < roman.length(); i++) {
	    now = romanMap.get(roman.substring(i, i + 1));
	    if (now > prev) {
		now -= prev;
		sum -= prev;
	    }
	    sum += now;
	    prev = now;
	}
	return sum;
    }
}