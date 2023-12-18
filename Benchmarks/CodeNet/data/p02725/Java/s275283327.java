import java.util.Scanner;

public class Main {

	// test 3 C
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		int ary[] = new int[n];

		for(int i =0; i<n; i++) {
			ary[i] = sc.nextInt();
		}

		// 全ての家間の距離を調査しつつ、最大の距離を求める。
		// 最大 > (K/2) の場合、それは K-最大 に adjust する
		int maxLen = 0;
		for(int i=0; i< (n-1); i++) {
			for(int j=i+1;j<n;j++) {
				int dist1;
				if (ary[j]>ary[i]) {
					dist1 = ary[j]-ary[i];
				}
				else {
					dist1 = ary[i]-ary[j];
				}
//				log("i:" + i + "  j:" + j + "  dist1:"+dist1 + " ary[i]:" + ary[i] + "  ary[j]" + ary[j]);
				if ( dist1 > (k/2) ) {
//					dist1 = k - dist1;
					dist1 = k - dist1;
				}
//				log("   new dist:" + dist1);
				
				if(maxLen<dist1)
					maxLen = dist1;
			}
		}
		
		int tripLen = k - maxLen;
		
		log( tripLen );
		sc.close();
		
	}
	
	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

	static void log(double d) {
		System.out.printf("%.12f\n",d);
	}

	
}
