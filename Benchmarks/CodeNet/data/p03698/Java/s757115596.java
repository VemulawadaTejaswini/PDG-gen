import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String S=sc.next();
		boolean f=true;
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<S.length();i++) {
			int temp=(int)S.charAt(i);
			if(a.contains(temp)) {
				f=false;
				break;
			}
			else {
				a.add(temp);
			}
		}
		System.out.println(f?"yes":"no");
	}
}