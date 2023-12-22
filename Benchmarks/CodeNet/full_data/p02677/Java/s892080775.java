import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();
		int kaku = 0;
		
		h = h*30;
		if(m!=0) {
			h += m*0.5;
		}
		m = m*6;
		
		kaku = Math.min(h-m, 360-(h-m));
		
		double ans = 0;
		
		
		if(kaku == 180) {
			ans = a+b;
		}else if(kaku!=90) {
			ans = Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*Math.cos(kaku*(Math.PI/180));
		}else {
			ans = Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*0;
		}
		
		System.out.println(Math.sqrt(ans));
		
		
		
		
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
