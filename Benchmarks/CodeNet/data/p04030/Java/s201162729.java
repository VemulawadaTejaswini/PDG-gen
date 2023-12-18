import java.util.*;
public class Main {
	
	private static List<String> hateList = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		char[] inArray = in.toCharArray();
		StringBuffer buf = new StringBuffer();
		for (int i = 0 ; i < inArray.length; i++) {
			String key = Character.toString(inArray[i]);
			if (!key.equals("B")) {
				buf.append(key);
			} else {
				if(buf.length() != 0) {
					buf.delete(i -1, i);
				}
			}
		}
		System.out.println(buf.toString());
 
	}
	

 
}