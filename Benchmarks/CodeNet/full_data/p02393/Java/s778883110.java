import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
/*
		String nums = sc.nextLine();
		String num[] = nums.split(" ");
		ArrayList alist = new ArrayList();
		for(int i = 0;i < num.length;i++){
			alist.add(Integer.parseInt(num[i]));
		}
*/	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int tmp = 0;
		if(a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		if(b > c){
			tmp = b;
			b = c;
			c = tmp;
		}
		if(a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		
		//Collections.sort(alist);

		System.out.println(a + " " + b + " " + c);
	}
}
