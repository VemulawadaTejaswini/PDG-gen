import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();
			char[]n = new char[N];
			char[]m = new char[M-1];
			Arrays.fill(n, '0');
			Arrays.fill(m, '1');
			String s = new String(n);
			String k = new String(m);
			String x = s+k;
			
			int Q = scan.nextInt();
			int[]a = new int[Q];
			int[]b = new int[Q];
			int[]c = new int[Q];
			int[]d = new int[Q];
			for(int i = 0;i<Q;i++) {
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();
				c[i] = scan.nextInt();
				d[i] = scan.nextInt();
			}
			
			long max = 0;
			
			
			 while (true) {
			  //System.out.println(x);
				 int[]A = new int[N]; 
			  int count = 1;
			  int l = 0;
			  for(int i = 0;i<N+M-1;i++) {
				  char g = x.charAt(i);
				  if(g=='0') {
					  A[l] = count;
					  l++;
				  }else{
					  count++;
				  }
			  }
			  
			  for(int i = 0;i<N;i++) {
				 // System.out.print(A[i]);
				  //System.out.print(" ");
			  }
			  //System.out.println();
			  
			  long souwa = 0;
			  for(int i = 0;i<Q;i++) {
				  int o = A[b[i]-1]-A[a[i]-1];
				  if(o==c[i])souwa+=d[i];
			  }
			  
			  if(max<souwa)max = souwa;
			  
	
			  x = nextPermutation(x);
			  if (x.equals("Final")) break;
			  }
			 
			 System.out.println(max);
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	
	
	//与えられた文字の種類と文字数を元に、初めの文字から順番に文字列を出力するメソッド
	//区別されているものを、順番に並べる通りを全列挙、、、、順列を順番に列挙(N種類ならN個の文字列になる必要がある。)
	//区別されていないもを、順番に並べる通りを全列挙,,,,,,組み合わせを順番に列挙になる。nCkなら０ｎ個１k個という順番でスターと。
	
	
	private static String nextPermutation (String s) {
		/*入力した文字列(数列、英語小文字、英語大文字)の次の順番を返すメソッド
		 * String s = "ABC";
		 * while (true) {
		 * System.out.println(s);
		 * s = nextPermutation(s);
		 * if (s.equals("Final")) break;
		 * }
		 * とmainメソッド に書けばN文字の文字列をN!文小さい物から順に列挙することができる*/

		ArrayList<Character> list = new ArrayList<>();
		for (int i=0; i<s.length(); i++) list.add(s.charAt(i));

		int pivotPos = -1;
		char pivot = 0;
		for (int i=list.size()-2; i>=0; i--) {
			if (list.get(i) < list.get(i+1)) {
				pivotPos = i;
				pivot = list.get(i);
				break;
			}
		}

		if (pivotPos==-1 && pivot==0) return "Final";

		int L = pivotPos+1, R = list.size()-1;
		int minPos = -1;
		char min = Character.MAX_VALUE;
		for (int i=R; i>=L; i--) {
			if (pivot < list.get(i)) {
				if (list.get(i) < min) {
					min = list.get(i);
					minPos = i;
				}
			}
		}

		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));

		StringBuilder sb = new StringBuilder();
		for (int i=0; i<list.size(); i++) sb.append(list.get(i));

		return sb.toString();

	}
	
	
	
	
		
	}





	
		



