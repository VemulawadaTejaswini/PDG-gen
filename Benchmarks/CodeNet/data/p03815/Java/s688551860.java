import java.util.*;
public class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		long x=s.nextLong();

		//for(x=1;x<100;x++) {
			long count=(x/11)*2;
			//System.out.printf("%3d ",x);
			if(x%11==0) {
				System.out.println(count);
			}else if (x%11<=6) {
				System.out.println(count+1);
			}else {
				System.out.println(count+2);
			}
		//}
	}
}
