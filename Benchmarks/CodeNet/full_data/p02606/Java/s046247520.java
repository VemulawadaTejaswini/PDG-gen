package Number_of_multiply;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int L=in.nextInt();
			int R=in.nextInt();
			int d=in.nextInt();
			int count=0;
			for(int i=L;i<=R;i++) {
				if(i%d==0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
