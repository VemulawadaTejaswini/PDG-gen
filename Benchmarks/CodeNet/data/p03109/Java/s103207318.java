import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[]pooeater = s.split("/");
		int[]n = new int[3];
		n[0] = Integer.parseInt(pooeater[0]);
		n[1] = Integer.parseInt(pooeater[1]);
		n[2] = Integer.parseInt(pooeater[2]);
		if(n[0]>2019) {
			System.out.println("TBD");
		}else if(n[1]>04) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}
	}

}
