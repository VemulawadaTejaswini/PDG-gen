import java.util.Arrays;
import java.util.Scanner;

//Icicles
public class Main{

	int n, L;
	long[] t;
	int[] a;
	
	long get(int k){
		if(t[k]!=-1)return t[k];
		long l = 0;
		long r = 0;
		if(a[k]<a[k-1])l=get(k-1);
		if(a[k]<a[k+1])r=get(k+1);
		return t[k] = L-a[k]+Math.max(l, r);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		L = sc.nextInt();
		a = new int[n+2];
		for(int i=1;i<=n;i++)a[i]=sc.nextInt();
		t = new long[n+2];
		Arrays.fill(t, -1);
		t[0]=t[n+1]=0;
		long max = 0;
		for(int i=1;i<=n;i++)max=Math.max(max, get(i));
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}