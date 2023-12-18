import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();
	int m = scan.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++){
	    a[i] = scan.nextInt();
	}
	int[] b = new int[m];
	int[] c = new int[m];
	for(int i = 0; i < m; i++){
	    b[i] = scan.nextInt();
	    c[i] = scan.nextInt();
	}

	/* 基本となる数値をソート */
	Arrays.sort(a);

	for(int i = 0; i < m; i++){
	    for(int j = 0; j < b[i]; j++){
		if(a[j] < c[i]){
		    a[j] = c[i];
		}else{
		    break;
		}
	    }
	    Arrays.sort(a);
	}

	long sum = 0;
	for(int i = 0; i < n; i++){
	    sum += a[i];
	}

	System.out.println(sum);
    }
}