import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long[] v =  new long[n];

		for(int i = 0;i < n;i++){
			v[i] = sc.nextLong();
		}
		Arrays.sort(v);
		
		long sum = 0;
		for(int i = 0;i < a;i++){
			sum += v[n-1-i];
		}
		
		double ans = (double)sum/a;
		
		long c = 0;
		for(int i = 0;i < n;i++){
			if(v[i] == v[n-a]){
				c++;
			}
		}

		System.out.println(ans);
		System.out.println(c);





	}
}

class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


