import java.util.*;
public class Main {
	
	private static List<String> hateList = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] inArray = in.split(" ");
		int N = Integer.parseInt(inArray[0]);
		int K = Integer.parseInt(inArray[1]);
		int MAX = 10000;
		String hateStr = sc.nextLine();
		String[] hateArray = hateStr.split(" ");
		for (int i = 0; i < K;i++) {
			hateList.add(hateArray[i]);
		}
		for (int i = N; i < MAX; i++) {
			String kin = Integer.toString(i);
			if (isContain(kin)) {
				System.out.println(i);
				break;
			}
			
		}

	}
	
	private static boolean isContain(String in) {
		boolean result = true;
		for (int i = 0; i < hateList.size();i++) {
			if (in.indexOf(hateList.get(i)) >= 0) {
				result = false;
			}
		}
		
		return result;
	}
	

}
