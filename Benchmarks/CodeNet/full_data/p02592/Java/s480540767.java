import java.util.*;

public class Main {
	static long[] a;
	static ArrayList<String> ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
		ans = new ArrayList<>();
		
		int N = 200000;
		a = new long[N];
//		a[0] = A;
//		a[1] = B;
		
		int inc = 4;
		add(0, 1, 3);
		compare(2, 3, inc+1);
		compare(2, 3, inc+2);
		for(int i=1; i<=10; i++) {
			add(inc+1, inc+i, inc+i+1);
		}
		
		int aa = inc+12;
		for(int i=0; i<10; i++) {
			compare(inc+i, 0, aa+i);
		}
		
		int bflag = aa+10;
		int amaskb = bflag+1;
		for(int i=0; i<=10; i++) {
			compare(1, inc+i+1, bflag);
			for(int j=0; j<10; j++) {
				compare(bflag, aa+j, amaskb);
				add(2, amaskb, 2);
			}
		}
		
		output();
		sc.close();
	}

	static void add(int i, int j, int k) {
//		a[k] = a[i] + a[j];
		ans.add("+ "+i+" "+j+" "+k);
	}
	static void compare(int i, int j, int k) {
//		a[k] = a[i] < a[j] ? 1 : 0;
		ans.add("< "+i+" "+j+" "+k);
	}
	static void output() {
//		System.out.println(a[2]);
		System.out.println(ans.size());
		for(String s : ans)
			System.out.println(s);
	}
}

