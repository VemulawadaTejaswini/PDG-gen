import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	int[] b = new int[n];
	int m = 0;
	boolean flag = false;
	for(int i = 0; i < n; i++){
		a[i] = Integer.parseInt(sc.next());
	}
	Arrays.sort(a);
	if(n%3 == 0){
	for(int i = 1; i < n; i++){
		b[0] = a[0];
		b[1] = a[i];
		for(int j = 2; j < n; j++){
			b[j] = b[j-1]^b[j-2];
		}
		Arrays.sort(b);
		if(Arrays.equals(a,b))flag = true;
	}
	for(int i = 0; i < n; i++){
		m += a[i];
	}
	}
	if(flag || m == 0){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
}
}