

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> b = new  ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			b.add(sc.nextInt());
		}
		ArrayList<Integer> a = new  ArrayList<Integer>();
		for(int i =b.size()-1;i>=0;i--) {
			a.add(b.get(i));
		}
		
		int i=0;
		int sum = 0;
		while(i+2<=a.size()-1) {
			if(Math.abs(a.get(i+1)-a.get(i))<Math.abs(a.get(i+2)-a.get(i))) {
				sum = sum + Math.abs(a.get(i+1)-a.get(i));
				i = i + 1;
			}else {
				sum = sum + Math.abs(a.get(i+2)-a.get(i));
				i = i + 2;
			}
		}
		if(i==a.size()-2) {
			sum = sum + Math.abs(a.get(i)-a.get(a.size()-1));
		}
		System.out.println(sum);
	}

}
