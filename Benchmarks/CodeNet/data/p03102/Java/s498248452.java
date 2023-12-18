package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EnergyDrinkCollector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		class DoubleInteger implements Comparable<DoubleInteger>{

			int a;
			int b;

			public int compareTo(DoubleInteger ab) {return ab.a<this.a ? 1 : ab.a==0 ? 0 : -1;}

			public DoubleInteger(int a, int b) {
				this.a=a;
				this.b=b;
			}

		}

		List<DoubleInteger> AB = new LinkedList<>();

		for(int i=0;i<N;i++) {

			int a =sc.nextInt();

			if(a == 0) {
				break;
			}else{
			int b =sc.nextInt();
			AB.add(new DoubleInteger(a,b));
			}

		}

		Collections.sort(AB);

		double result = 0;
		int i = 0;
		for(;M>0;i++) {
			result += AB.get(i).a * AB.get(i).b;
			M -= AB.get(i).b;
		}
		i--;

		result -= Math.abs(M) * AB.get(i).a;
		System.out.println(result);

	}

}