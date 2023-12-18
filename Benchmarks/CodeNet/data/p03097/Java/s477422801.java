




import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		




		int[] ans = construct(n,a,b);
		if (ans == null) {
			System.out.println("NO");
			
		} else {
			System.out.println("YES");
			for (int i=0;i<ans.length;i++) {
				System.out.print(ans[i]);
				if (i<ans.length-1) {
					System.out.print(" ");
				} else {
					System.out.println("");
				}
			}
		}

		

	}
	static int[] construct(int n, int a, int b) {
		int diff = a^b;
		int size = 1<<n;
		/*
		ArrayList<Integer> arl = new ArrayList<>();
		for (int i=0;i<n;i++) {
			if ((diff>>i)%2!=0) {
				arl.add(i);
			}
		}*/
		int first = Integer.highestOneBit(diff);
		if (first == 0) {
			return null;
		}
		int second = Integer.highestOneBit(diff^first);
		if (second == 0) {
			// gray code
			
			int[] gray = new int[size];
			for (int i=0;i<size;i++) {
				gray[i]=a^i^(i>>1);

				// swap digits
				int tmp = gray[i] & diff;
				int tmp2 = gray[i] & (1<<(n-1));

				gray[i]=gray[i]^tmp^tmp2
						^((tmp/diff)<<(n-1))
						^((tmp2>>(n-1))*diff);

			}

			return gray;

		} else {
			int[] tmp1 = construct (n-1,a,b^first^second);
			int[] tmp2 = construct (n-1,b^first,b);
			if (tmp1 == null || tmp2 == null) {
				return null;
			}
			
			int[] ans = new int[size];
			System.arraycopy(tmp1, 0, ans, 0, size/2);
			System.arraycopy(tmp2, 0, ans, size/2, size/2);
			return ans;
		}
	}


}
