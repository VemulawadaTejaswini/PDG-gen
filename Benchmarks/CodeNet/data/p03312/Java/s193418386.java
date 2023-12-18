
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i =0 ; i <n ; i++){
			a[i] = sc.nextInt();
		}
		
		long s[] = new long[n];
		
		s[0] = a[0];
		for(int i = 1; i< n ;i++){
			s[i] = s[i-1]+a[i];
		}
		
		long left =1 ;
		long right = s[n-1]/4 + 1;			
		for(;left != right;){
			
			long mid = (left+right+1)/2;
			if(attempt(s,mid)){
				left = mid;
			}else{
				right = mid-1;
			}
		}
		
		long min = left;
		long pt1 = pt(s,min);
		long pt2 = pt(s,min-1);
		System.out.println(Math.min(pt1, pt2));
	}
	
	
	boolean attempt(long[] s, long mid){
		int n = s.length;

		int pid = Arrays.binarySearch(s, mid);
		if(pid < 0){
			pid = -pid-1;
		}
		if(pid  >= n){
			return false;
		}
		long p = s[pid];
		int qid = Arrays.binarySearch(s, p+mid);
		if(qid < 0){
			qid = -qid-1;
		}
		if(qid  >= n){
			return false;
		}
		long q = s[qid]-p;
		int rid = Arrays.binarySearch(s, p+q+mid);
		if(rid < 0){
			rid = -rid-1;
		}
		if(rid  >= n){
			return false;
		}

		long r = s[rid] - p - q;
		
		long ss = s[n-1] - p - q - r;
		
		return ss >= mid;
	}
	
	long pt(long[] s, long min){
		int n = s.length;
		long left = min;
		long right = s[n-1];
		
		for(;left != right;){
			
			long mid = (left+right)/2;
			if(test(s,min,mid)){
				right = mid;
			}else{
				left = mid + 1;
			}
		}
		return left - min;
		
	}
	
	boolean test(long[] s , long min ,long max){
		int n  =s.length;
		int pfrom = Arrays.binarySearch(s, min);
		if(pfrom < 0){
			pfrom = -pfrom-1;
		}
		int pto = Arrays.binarySearch(s, max);
		if(pto < 0){
			pto = -pto-1;
			pto -= 1;
		}
		if(pfrom >= n || pto < 0){
			return false;
		}
		long pmin = s[pfrom];
		long pmax = s[pto];

		int qfrom = Arrays.binarySearch(s, min+pmin);
		if(qfrom < 0){
			qfrom = -qfrom-1;
		}
		int qto = Arrays.binarySearch(s, max+pmax);
		if(qto < 0){
			qto = -qto-1;
			qto -= 1;
		}

		if(qfrom >= n || qto < 0){
			return false;
		}
		
		long qmin = s[qfrom];
		long qmax = s[qto];

		int rfrom = Arrays.binarySearch(s, min+qmin);
		if(rfrom < 0){
			rfrom = -rfrom-1;
		}
		int rto = Arrays.binarySearch(s, max+qmax);
		if(rto < 0){
			rto = -rto-1;
			rto -= 1;
		}
		if(rfrom >= n || rto < 0){
			return false;
		}

		long rmin = s[rfrom];
		long rmax = s[rto];


		int ssmin = Arrays.binarySearch(s, s[n-1] - max);
		if(ssmin < 0 ){
			ssmin = -ssmin-1;
		}
		int ssmax = Arrays.binarySearch(s, s[n-1] - min);
		if(ssmax < 0){
			ssmax = -ssmax-1;
			ssmax += 1;
		}
		
		
		if(ssmin > rto || ssmax < rfrom){
			return false;
		}
		return true;
	}
	
}
