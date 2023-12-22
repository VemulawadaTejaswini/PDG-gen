

import java.util.Scanner;

public class Main {
	static int n;
	static int k;
	static int[] weight;
	public Main(int n,int k,int[] weight) {
		this.n= n;
		this.k = k;
		this.weight = weight;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();	
		int[] weight = new int[n];
		int total = 0;
		for(int i=0;i<n;i++) {
			weight[i] = sc.nextInt();
			total+=weight[i];
		}
		
		Main al = new Main(n,k,weight);
//		System.out.println(al.check(9));
		
		int p = al.binarySearch(1, total);
		System.out.println(p);
		
		
		
		

	}
	
	public static int binarySearch(int start,int end) {
		int mid;
		mid = (start + end)/2;
		if(check(mid-1) == true) {
			
			  return binarySearch(start, mid-1);
		}else if(check(mid+1) == false) {
			return binarySearch(mid+1,end);
		}else {
			return mid;
		}
		
		
	}
	
	public static boolean check(int p) {
		int next = 0;
		
		for(int i=0;i<k;i++) {	
			int max = 0;
			for(int j=next;j<n;j++) {
				max = max+weight[j];
				if(max>p) {
					next = j;
					break;
				}else if(max<=p && j==n-1) {
					return true;
				}
			}
		}
		return false;
	}

}

