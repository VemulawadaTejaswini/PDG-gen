import java.util.*;

class Main{
	static String[] checkArr = {"dreamer","dream","eraser","erase"};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.next();

		LABEL:while(true) {
			//System.out.println(in);
			if(in.length()==0) {
				System.out.println("YES");
				return;
			}

			for(String com : checkArr) {
				int dum = in.lastIndexOf(com);
				if(dum>=0 && in.length()-dum==com.length()) {
					in = in.substring(0,dum);
					continue LABEL;
				}
			}

			System.out.println("NO");
			return;
		}
	}
}
