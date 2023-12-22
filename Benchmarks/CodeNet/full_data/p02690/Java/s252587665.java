import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		long X = sc.nextLong();
		
		int i = 0, j = 0;
		boolean flag = false;
		for(i = 0; i < 119; i++) {
			for(j = 0; j < 119; j++) {
				if((long)Math.pow(i, 5) + (long)Math.pow(j, 5) == X) {
					flag = true;
					break;
				}
			}
			if(flag)break;
		}
		
		if(flag)System.out.println(j+" "+(-i));
		
		if(!flag) {
			for(i = 0; i < 119; i++) {
				for(j = 0; j < 119; j++) {
					if((long)Math.pow(i, 5) - (long)Math.pow(j, 5) == X) {
						flag = true;
						break;
					}
				}
				if(flag)break;
			}
			System.out.println(i+" "+j);
		}
		sc.close();
	}
}