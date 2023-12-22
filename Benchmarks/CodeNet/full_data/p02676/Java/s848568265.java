import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		String s = scan.next();
		String ans = "";
		
		if(s.length() <= k) {
			System.out.println(s);
		}else {
			for(int i=0;i<k;i++) {
				ans += s.charAt(i);
			}
			ans += "...";
			System.out.println(ans);
		}
		
	}	
	
	
	//�ŏ�����
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
	//����ւ�
	/*
	static int swap (int a, int b) {
		int swap_arr[] = new int[2];
		
		swap[0] = b;
		swap[1] = a;
		
		return swap_arr;
	}
	*/
	
}

