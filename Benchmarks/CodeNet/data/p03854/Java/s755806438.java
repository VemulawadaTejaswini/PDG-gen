import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String str = s.next();
		String[] m = {"eraser","erase","dreamer","dream"};
		boolean f;
		do {
			f=false;
			for(String b:m) {
				if(str.endsWith(b)) {
					str=str.substring(0, str.length()-b.length());
					f=true;
					break;
				}
			}
		}while(f);
		System.out.println((str.equals(""))?"YES":"NO");
	}
}