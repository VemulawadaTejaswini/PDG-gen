import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long ans = 0;
		int ans2 = 0;

		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int  k = sc.nextInt();
//		longd = sc.nextInt();
		String string = sc.next();
		StringBuilder s = new StringBuilder(string);

//		boolean f = false;
//		int[] a = new int[n-1];
//		for (int i = 0; i < n-1; i++) {
//			a[i] = sc.nextInt();
//		}
//		int[] b = new int[n+1];
//		int[] c = new int[n+1];
//		for (int i = 1; i <n+1; i++) {
//			b[i] = sc.nextInt();
//		}
//		for (int i = 1; i <n; i++) {
//			c[i] = sc.nextInt();
//		}

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = 0;
		}

		int tmpl = 0;
		int tmpr = 0;
		boolean f = false;
		for(int i=0; i<n; i++) {
			if(s.charAt(i) == 'L') {
				tmpl++;
			} else {
				tmpr++;
			}
		}
		if(tmpl >= tmpr) {
			f=true;
		}


		int chash = 0;
		int index = 0;

		for(int i = 0; i<k; i++) {
			chash = 0;
			index = 0;
			for(int j = 0; j <n; j++) {
				if(f) {
					if(s.charAt(j) == 'L') {
						if(j > 0 && s.charAt(j-1) == 'L') {
							a[j] = a[j-1] + 1;
						} else {
							a[j] = 0;
						}
					} else {
						if(j > 0 && s.charAt(j-1) == 'R') {
							a[j] = a[j-1] - 1;
						}else {
							a[j] = -1;
						}
						if(chash > a[j]) {
							chash = a[j];
							index = j;
						}
					}
				} else {
					if(s.charAt(j) == 'R') {
						if(j > 0 && s.charAt(j-1) == 'R') {
							a[j] = a[j-1] + 1;
						} else {
							a[j] = 0;
						}
					} else {
						if(j > 0 && s.charAt(j-1) == 'L') {
							a[j] = a[j-1] - 1;
						}else {
							a[j] = -1;
						}
						if(chash > a[j]) {
							chash = a[j];
							index = j;
						}
					}
				}
//				System.out.print(a[j]+ " ");
			}

			if (chash == 0) break;

			for(int l = index+chash + 1; l <= index; l++) {
				if(f) s.setCharAt(l, 'L');
				else s.setCharAt(l, 'R');
			}
//			System.out.print(s);
//			System.out.println(" " + chash + " " + index);
		}

//		System.out.println(s);

		if(f) {
			for(int i=0; i<n; i++) {
				if(s.charAt(i) == 'L') {
					if(i > 0 && s.charAt(i-1) == 'L') {
						ans2++;
					}
				}
			}
		} else {
			for(int i=0; i<n; i++) {
				if(s.charAt(i) == 'R') {
					if(i > 0 && s.charAt(i-1) == 'R') {
						ans2++;
					}
				}
			}
		}

		System.out.println(ans2);

		sc.close();
	}
}