import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		boolean flag = true;
		for(int i=0; i<9;i++) {
			num.add(sc.nextInt());
		}
		int n = sc.nextInt();
		for(int i=0; i<n;i++ ) {
			if(num.contains(sc.nextInt())) {
				flag = true;
				break;
			}
			else {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
}