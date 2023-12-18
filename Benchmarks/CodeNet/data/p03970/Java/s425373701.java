import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		int cnt = 0;
		String cf2016 = "CODEFESTIVAL2016";
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		for (int i = 0; i < cf2016.length(); ++i) {
			if(s.charAt(i) != cf2016.charAt(i)){
				++cnt;
			}
		}
		System.out.println(cnt);
	}
}
