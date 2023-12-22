import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<String,String> h = new HashMap<String,String>();
		h.put("D","A"); h.put("E","B"); h.put("F","C");
		h.put("G","D"); h.put("H","E"); h.put("I","F");
		h.put("J","G"); h.put("K","H"); h.put("L","I");
		h.put("M","J"); h.put("N","K"); h.put("O","L");
		h.put("P","M"); h.put("Q","N"); h.put("R","O");
		h.put("S","P"); h.put("T","Q"); h.put("U","R");
		h.put("V","S"); h.put("W","T"); h.put("X","U");
		h.put("Y","V"); h.put("Z","W"); h.put("A","X");
		h.put("B","Y"); h.put("C","Z");
		Scanner sc = new Scanner(System.in);
		String in = sc.next() , result = "";
		for( int i = 0; i < in.length(); i++ )
			result += h.get(in.charAt(i)+"");
		System.out.println(result);
	}
}