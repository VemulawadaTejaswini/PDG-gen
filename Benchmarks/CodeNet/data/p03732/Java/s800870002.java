
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = scan.nextInt();
	int W = scan.nextInt();
	List<Integer> value0 = new ArrayList<Integer>();
	List<Integer> value1 = new ArrayList<Integer>();
	List<Integer> value2 = new ArrayList<Integer>();
	List<Integer> value3 = new ArrayList<Integer>();
	
	int w0 = scan.nextInt();
	value0.add(scan.nextInt());
	for(int i=1; i<N; i++) {
	    int w = scan.nextInt();
	    int v = scan.nextInt();
	    switch(w-w0) {
		case 0: value0.add(v); break;
		case 1: value1.add(v); break;
		case 2: value2.add(v); break;
		case 3: value3.add(v); break;
	    }
	}
	
	Collections.sort(value0);
	Collections.sort(value1);
	Collections.sort(value2);
	Collections.sort(value3);	

	int[] sum0 = calcSum(value0);
	int[] sum1 = calcSum(value1);
	int[] sum2 = calcSum(value2);
	int[] sum3 = calcSum(value3);

	int max = W / w0;
	int min = W / (w0+3);

	int ans = 0;
	for(int i=0; i<sum0.length; i++) {
	    for(int j=0; j<sum1.length; j++) {
		for(int k=0; k<sum2.length; k++) {
		    for(int l=0; l<sum3.length; l++) {
			int num = i+j+k+l;
			if(num < min) continue;
			else if(num > max) break;
			int weight = i*w0 + j*(w0+1) + k*(w0+2) + l*(w0+3);
			if(weight > W) break;
			int tmp = sum0[i] + sum1[j] + sum2[k] + sum3[l];
			ans = tmp > ans ? tmp : ans;
		    }
		}
	    }
	}
	System.out.println(ans);
	scan.close();
    }

    private static int[] calcSum(List<Integer> value) {
	int[] sum = new int[value.size()+1];
	sum[0] = 0;
	if(value.size() == 0) return sum;
	for(int i=1; i<sum.length; i++) {
	    sum[i] = sum[i-1] + value.get(i-1);
	}
	return sum;
    }
}
