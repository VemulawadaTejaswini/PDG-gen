import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int[] l = new int[n];
	for(int i=0; i<n; i++) {
		l[i] = sc.nextInt();
	}
	int sum = 0;
	Arrays.sort(l);
	int[] m = new int[n];
	for(int i=0; i<n; i++) {
		m[i] = l[n-1-i];
	}
	for(int i=0; i<n; i++) {
		l[i] = m[i];
	}
	for(int i=0; i<k; i++) {
		sum += l[i];
	}
	System.out.println(sum);
}
}
