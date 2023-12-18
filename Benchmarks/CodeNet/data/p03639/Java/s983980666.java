import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int count4 = 0;
		int count2 = 0;
		int countn = 0;
		for(int i = 0; i < N; i++) {
			if(a[i] % 4 == 0) count4++;
			else if(a[i] % 2 == 0) count2++;
			else countn++;
		}
		boolean ok = true;
		if(count2 >= 2) count2 = 0;
		if(count2 == 1) {
			if(count4 >= 1) {
				countn--;
				count4--;
				count2--;
			} else {
				ok = false;
			}
		}
		if(countn >= 2) {
			if(countn / 2 + (countn%2==0?0:1) <= count4) {
				;
			} else {
				ok =false;
			}
		}
		if(countn == 1) {
			if(count4 >= 1) {
				countn--;
				count4--;
			} else {
				ok = false;
			}
		}
		
		if(ok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
		
		
	}
}