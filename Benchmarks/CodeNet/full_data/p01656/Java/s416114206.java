import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Data[] list = new Data[n+1];
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, 1989);
		list[0] = new Data(cal,"kogakubu10gokan");
		int ans = 0;
		Calendar check = Calendar.getInstance();
		check.clear();
		check.set(Calendar.YEAR, q + 1988);
		
		
		for(int i = 1; i <= n; i++) {
			cal = Calendar.getInstance();
			cal.clear();
			cal.set(Calendar.YEAR, 1988 + sc.nextInt());
			if(check.compareTo(cal) >= 0) ans = i;
			list[i] = new Data(cal,sc.next());
			
			
		}
		System.out.println(list[ans].name);
		
		
	}
	static class Data {
		Calendar cal;
		String name;
		Data(Calendar a, String b) {
			cal = a;
			name = b;
		}
	}
}