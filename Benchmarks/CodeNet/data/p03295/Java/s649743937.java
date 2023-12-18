import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int []a = new int[M];
		int []b = new int[M];
		List<Integer> listA = new ArrayList<Integer>();
		List<Integer> listB = new ArrayList<Integer>();
		for(int i = 0; i < M; i++) {
			int t1 = scan.nextInt();
			int t2 = scan.nextInt();
			a[i] = t1;
			b[i] = t2;
			listA.add(t1);
			listB.add(t2);
		}
		scan.close();

//		int []c = new int[N + 1];
//		for(int i = 0; i < N; i++) {
//			for(int j = a[i]; i <= b[i]; i++) {
//				c[j] ++;
//			}
//		}

		int []t = new int[N + 2];

		for(int i = 0; i < M; i++) {
			t[a[i]]++;
			t[b[i] + 1]--;
		}
		for(int i = 1; i <= N; i++) {
			t[i] += t[i - 1];
		}


//		for(int i = 1; i <= N; i++) {
//			System.out.print(i + " ");
//		}

//		System.out.println();
//		for(int i = 1; i <= N; i++) {
//			System.out.print(t[i] + " ");
//		}
//		System.out.println();
		int max = 0;
		// 切断点
		int k = 0;;

		int begin = 1;
		int cnt = 0;
		double k2 = 0;
		while(true) {
			max = 0;
			for(int i = 1; i <= N; i++) {
				if(max < t[i]) {
					max = t[i];
					k = i;
				}
			}
			if(k == N) {
				k2 = (double)N - 0.5;
			}else {
				k2 = (double)k + 0.5;
			}
			//System.out.println("k " + k + " " + max);
			cnt ++;
			begin = k + 1;
			if(begin == N) {
				break;
			}
			//System.out.println(listA.size());
			ArrayList<Integer> listA1 = new ArrayList<Integer>();
			ArrayList<Integer> listB1 = new ArrayList<Integer>();
			for(int i = 0; i < listA.size(); i++) {
				if(!(k2 >= listA.get(i) && k2 <= listB.get(i))) {
					listA1.add(listA.get(i));
					listB1.add(listB.get(i));
				}
			}
			listA.clear();
			listB.clear();
			for(int i = 0; i < listA1.size(); i++) {
				listA.add(listA1.get(i));
				listB.add(listB1.get(i));
			}

//			for(int i = 0; i < listA.size(); i++) {
//				System.out.println(listA.get(i) + " " + listB.get(i));
//			}

			Arrays.fill(t, 0);
			for(int i = 0; i < listA.size(); i++) {
				t[listA.get(i)]++;
				t[listB.get(i) + 1]--;
			}
			for(int i = 1; i <= N; i++) {
				t[i] += t[i - 1];
			}
			if(listA.size() == 0) {
				break;
			}
			if(max == 0) {
				break;
			}
		}
		//System.out.println("size " + listA.size());
		Arrays.fill(t, 0);
		for(int i = 0; i < listA.size(); i++) {
			t[listA.get(i)]++;
			t[listB.get(i) + 1]--;
		}
		for(int i = 1; i <= N; i++) {
			t[i] += t[i - 1];
		}

//		for(int i = 1; i <= N; i++) {
//			System.out.print(t[i] + " ");
//		}
//		System.out.println();


//		for(int i = 1; i <= N; i++) {
//			if(t[i] == 1) {
//				cnt++;
//			}
//	}

		System.out.println(cnt);
		//System.out.println(listA.size());

//		for(int i = 0; i < listA.size(); i++) {
//			System.out.println(listA.get(i) + " " + listB.get(i));
//		}

//		for(int i = 1; i <= N; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for(int i = 1; i <= N; i++) {
//
//			System.out.print(t[i] + " ");
//		}

//		System.out.println();
	}
}