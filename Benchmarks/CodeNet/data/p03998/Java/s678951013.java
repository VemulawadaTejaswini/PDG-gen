import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		String B = scan.nextLine();
		String C = scan.nextLine();
		List<String> AList = new ArrayList<String>();
		List<String> BList = new ArrayList<String>();
		List<String> CList = new ArrayList<String>();
		String tmp = "";
		
		for(int i = 0; i < A.length(); i++) {
			AList.add(A.substring(i, i + 1));
		}
		for(int i = 0; i < B.length(); i++) {
			BList.add(B.substring(i, i + 1));
		}
		for(int i = 0; i < C.length(); i++) {
			CList.add(C.substring(i, i + 1));
		}
		
		if(AList.size() != 0) {
			tmp = AList.get(0);
			AList.remove(0);
		}
		
		while(true) {
			if(tmp.equals("a")) {
				if(AList.size() != 0) {
					tmp = AList.get(0);
					AList.remove(0);
				} else {
					System.out.println("A");
					break;
				}
			} else if(tmp.equals("b")) {
				if(BList.size() != 0) {
					tmp = BList.get(0);
					BList.remove(0);
				} else {
					System.out.println("B");
					break;
				}
			} else if(tmp.equals("c")) {
				if(CList.size() != 0) {
					tmp = CList.get(0);
					CList.remove(0);
				} else {
					System.out.println("C");
					break;
				}
			}
		}
		scan.close();
	}

}
