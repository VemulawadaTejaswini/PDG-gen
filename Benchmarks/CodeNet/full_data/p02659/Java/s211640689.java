import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		long a = scan.nextLong();
		int b = 0;
		String s = scan.next();
		
		b += (s.charAt(0)-48)*100;
		b += (s.charAt(2)-48)*10;
		b += (s.charAt(3)-48);
		
		System.out.println(a*b/100);
		
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