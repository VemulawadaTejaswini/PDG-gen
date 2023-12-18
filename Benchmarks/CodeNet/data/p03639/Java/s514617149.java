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
		int[] num = new int[N];
		int id = 0;
		if(count2 >= 2) {
			for(id = 0; id < count2; id++) {
				num[id] = 2; 
			}
			count2 = 0;
		}
		if(count2 == 1 && count4 >= 1) {
			num[id++] = 2;
			num[id++]   = 4;
			num[id++] = 1;
			count4--;
			count2--;
			countn--;
		} if(count2 == 1 && count4 <= 0) {
			count4 = -999;
		}
		if(countn == 0) {
			;
		} else {
			if(countn == 1) count4--;
			if(countn >= 2) count4 -= countn / 2;
		}
		
		if(count4 < 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
		
		
		
		
	}
}