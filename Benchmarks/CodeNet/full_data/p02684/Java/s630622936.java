import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n_copy=n;
		long k = sc.nextLong();
		//long h = k%n;
		long k_copy = k;
		//System.out.println(h);
		long[] arr = new long[n+1];
		for(int i=1;i<=n;i++){
			arr[i]=sc.nextLong();
		}
		// find the cycle in the graph
		long l = arr[1];
		long r = arr[arr[1]];
		while(l!=r){
			l=arr[l];
			r=arr[arr[r]];
		}
		l =1;
		while(l!=r){
			l=arr[l];
			r=arr[r];
		}
		// found the first node of the cycle

		// number of the element before the start of the cycle
		long cycstart = l;
		long ele=0;
		l=1;
		while(l!=cycstart){
			ele++;
			l=arr[l];
		}

		// find the lenght of the cycle
		cycstart=l;
		long len=1;
		l=cycstart;
		while(arr[l]!=cycstart){
			len++;
			l=arr[l];
		}
		l=1;
		while(ele!=0 && k!=0){
			l=arr[l];
			ele--;
			k--;
		}
		if(k==0){
			System.out.println(l);
		}
		k = k%len;

		while(k!=0){
			l=arr[l];
			k--;
		}
		System.out.println(l);
	}
}