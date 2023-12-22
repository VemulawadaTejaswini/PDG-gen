import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static class NumString{
		void patternString() {
			for(;;) {
				int n = Integer.parseInt(sc.nextLine());
				if(n==0) break;
				StringBuffer str = new StringBuffer(sc.nextLine());

				for(int i=0; i<n; i++) {
					StringBuffer nstr = new StringBuffer();
					int count=1;
					for(int j=0; j<str.length(); j++) {
						if(j == str.length()-1) {
							nstr.append(Integer.toString(count));
							nstr.append(str.charAt(j));
						}else if(str.charAt(j) != str.charAt(j+1)) {
							nstr.append(Integer.toString(count));
							nstr.append(str.charAt(j));
							count=1;
						}else {
							count++;
						}
					}
					str = nstr;
				}

				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		NumString ns = new NumString();
		ns.patternString();
	}
}