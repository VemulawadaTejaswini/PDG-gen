import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		new Main().solve();
	}

	void solve(){

		Scanner cin = new Scanner(System.in);
		int[] num = new int[10001];
		LinkedList<Integer> l = new LinkedList<Integer>();
		for(int i=2;i<=10000;i++){
			if(isPrime(i)){
				LinkedList<Integer> nl = new LinkedList<Integer>();
				nl.add(i);
				for(int a : l) if(a+i<=10000){
					nl.add(a + i);
				}
				l = nl;
				for(int a : l) num[a]++;
			}
		}

		while(true)
		{
			int n = cin.nextInt();
			if(n==0) return;
			System.out.println(num[n]);
		}
	}

	boolean isPrime(int a){
		if(a<2) return false;
		for(int i=2;i*i<=a;i++){
			if(a%i==0) return false;
		}
		return true;
	}
}