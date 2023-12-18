import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Main{

	//static long[] a;
	static	int N ;
	static	int M ;
	static long[][] dp;
	static int ans = 100000000;
	static	boolean[] flag ;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<String> t = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();		

		for(int i = 0;i < N;i++){
			String x = sc.next();
			s.add(x);
			list.add(x);
		}
		int M = sc.nextInt();

		for(int i = 0;i < M;i++){
			String x = sc.next();
			t.add(x);
			list.add(x);
		}

		list = new ArrayList<String>(new HashSet<>(list));
		
	
		int ans = 0;

		for(int i = 0;i < list.size();i++){
			int count = 0;
			for(int j = 0;j < s.size();j++){
				if(s.get(j).equals(list.get(i)) ){
					count++;
				}
			}
			for(int j = 0;j < t.size();j++){
				if(t.get(j).equals(list.get(i))){
					count--;
				}
			}
			ans = Math.max(ans, count);

		}
		System.out.println(ans);





	}


}


