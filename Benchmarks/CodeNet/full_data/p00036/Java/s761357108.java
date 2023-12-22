import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
 private static Map<Integer, String> map = new HashMap<Integer, String>();
 static {
	map.put(49344, "A");
	map.put(16843009, "B");
	map.put(15, "C");
	map.put(33153, "D");
	map.put(1539, "E");
	map.put(131841, "F");
	map.put(387, "G");
 }

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in).useRadix(2);
	int i = 0;
	while (in.hasNext()) {
	 i <<= 8;
	 i |= in.nextInt();
	 if (Integer.bitCount(i) == 4) {
		i >>= Integer.numberOfTrailingZeros(i);
		System.out.println(map.get(i));
		i = 0;
	 }
	}
 }
}