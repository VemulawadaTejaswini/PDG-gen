

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static int[] Sorting(int[] a) {
		  int str = a[0];
		  for(int i = a.length - 1;  i > 0 ; i--) {
			  for(int j = 0; j < a.length- 1; j++){
			    if(a[j] < a[ j+1]){
			      str = a[ j];
			      a[ j] = a[ j+1];
			      a[j+1] = str;
			    }
			  }
		  }
		  return a;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		String str = reader.readLine();
		int N = Integer.parseInt(str);

//		System.out.println(N);

		int i = 0;
		int[] a = new int[N];

		while (i < N) {
			str = reader.readLine();
			a[i] = Integer.parseInt(str);
			i++;
		}

		a = Main.Sorting(a);

//		System.out.println(a[1] + a[2]);
//		for (i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

		int A = 0, B = 0;

		if (N % 2 == 0) {
			for(i = 0; i < N; i += 2) {
				A += a[i];
				B += a[i+1];
		}
		}else {
			for(i = 0; i < N-2; i += 2) {
				A += a[i];
				B += a[i+1];
			}
			A += a[N-1];
		}
		System.out.println(A - B);

		}

}
