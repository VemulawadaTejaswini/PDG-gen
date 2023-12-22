package AGC44;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.next());

		long[][] ca = new long[T][5];
		long[] ans = new long[T];
		for(int i = 0;i < T;i++) {
			 ca[i][0] = Long.parseLong(sc.next());
			 ca[i][1] = Long.parseLong(sc.next());
			 ca[i][2] = Long.parseLong(sc.next());
			 ca[i][3] = Long.parseLong(sc.next());
			 ca[i][4] = Long.parseLong(sc.next());

			 ans[i] = calc(ca[i]);
		}
		 sc.close();

		for(long a : ans) {
			System.out.println(a);
		}
	}

	public static long calc(long[] a) {
			 long total = 0;
			 long zan = 0;

			 long[] bb = new long[5];

			 while(zan != a[0]) {
				 if(zan == 0) {
					 zan++;
					 total += a[4];
				 }

				 long min =Long.MAX_VALUE;
				 int ii = 2;
//				 	System.out.println(String.valueOf(zan).length()*1000);
//				 	System.out.println(String.valueOf(a[0]).length());
				 if(String.valueOf(zan).length()*1000 < String.valueOf(a[0]).length()) {
					 bb[0] = Math.abs(a[0]-(zan * 2));
					 bb[1] = Math.abs(a[0]-(zan * 3));
					 bb[2] = Math.abs(a[0]-(zan * 5));
					 bb[3] = Math.abs(a[0]-(++zan ));
					 bb[4] = Math.abs(a[0]-(--zan ));

					 for(int i = 0; i < bb.length;i++) {
						 if(min >= bb[i]) {
							 min = bb[i];
							ii = i;
						 }
				 }

				 }
				 switch(ii) {
				 case 0:
					 zan = zan * 2;
					 total += a[1];
					 break;
				 case 1:
					 zan = zan * 3;
					 total += a[2];
					 break;
				 case 2:
					 zan = zan * 5;
					 total += a[3];
					 break;
				 case 3:
					 zan++;
					 total += a[4];
					 break;
				 case 4:
					 zan--;
					 total += a[4];
					 break;
				 }
				 System.gc();
			 }
		return total;

	}

}
