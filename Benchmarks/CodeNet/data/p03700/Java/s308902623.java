package beg63.prob4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		ArrayList<Integer> h = new ArrayList<Integer>();
		for(int i=0;i<N;i++)
			h.add(sc.nextInt());
		int count = 0;
		int div = divideHp(h);
		while(h.size()>0){
			bomb(h,A,B,maxIndex(h));
			count++;
		}
		System.out.println(count * div);
	}

	public static void bomb(ArrayList<Integer> h,int A,int B,int target){
		int t = target;
		for(int i=0;i<h.size();i++){
			if(i==t){
				h.set(i,h.get(i)-A);
			}else{
				h.set(i,h.get(i)-B);
			}
			if(h.get(i)<=0){
				h.remove(i);
				t--;
				i--;
			}
		}
	}



	public static int maxIndex(ArrayList<Integer> h){
		int max = 0;
		int index = 0;
		for(int i = 0;i<h.size();i++){
			if(max<h.get(i)){
				max = h.get(i);
				index = i;
			}
		}
		return index;
	}

	public static int minIndex(ArrayList<Integer> h){
		int min = h.get(0);
		int index = 0;
		for(int i = 1;i<h.size();i++){
			if(min>h.get(i)){
				min = h.get(i);
				index = i;
			}
		}
		return index;
	}

	public static int divideHp(ArrayList<Integer> h){
		int gcd = h.get(0);
		for(int i=1;i<h.size();i++){
			int m = 1;
			int n = 0;
			if(gcd<=h.get(i)){
				m = h.get(i);
				n = gcd;
			}else if(gcd == h.get(i)){
				n = 0;
			}else{
				m = gcd;
				n = h.get(i);
			}
			while(n>0){
				int pre_n = n;
				n = m % n;
				m = pre_n;
			}
			gcd = m;
		}
		for(int i=0;i<h.size();i++){
			h.set(i,h.get(i)/gcd);
		}
		return gcd;
	}

}
