import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N=sc.nextLong();
		sc.close();
		ArrayList<Long> num = new ArrayList<Long>(); 
		while(N!=0) {
			num.add(N%26l);
			N/=26l;
		}
		int num2[]=new int[num.size()];
		for(int i=num.size()-1;i>-1;i--) {
			System.out.print((char)(num.get(i)+96));
		}
	}
}
