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
		
		int new_dif = updateArray( k, n, ary);


		log( new_dif );
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
	
	static int updateArray( int k,int n, int[] ary) {
		int max = ary[0];
		int min = ary[0];
		for (int i = 0; i < ary.length; i++) {
		    int v = ary[i];
		    if (v > max) {
		        max = v;
		    }
		    if (v < min) {
		        min = v;
		    }
		}

		
		int new_dif;
		if ((max-min) > (k/2)){
			new_dif = (max-min) - (k-(max-min));
		}
		else {
			new_dif = (max-min);
		}

		return new_dif;

	}
	
	
	
}
