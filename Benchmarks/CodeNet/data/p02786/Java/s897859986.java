import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		System.out.println(saiki(h));
	}
	public static long saiki(long h){
		if(h==1) return 1;
		else {
			return 2*saiki(h/2)+1;
		}
	}
}
