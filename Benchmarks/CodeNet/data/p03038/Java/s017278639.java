import java.util.*;
public class Main{
		static int search(long a[],long k){ 
		int n=a.length;
		int l = 0, r = n; 
		int mid = 0; 
		while (l < r) { 
			mid = (r+l)/2; 
			if (a[mid]==k) {  
				while (mid+1<n && a[mid + 1] == k) 
				mid++; 
				break; 
			} 
			else if (a[mid] > k) 
				r = mid; 
			else
				l = mid + 1; 
		} 
		while (mid>-1&&a[mid]>k) 
			mid--; 
		return mid + 1; 
	} 
 	public static void main(String args[]){
     	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
     long a[]=new long[n];
      for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      for(int i=1;i<=m;i++){
       	int b=sc.nextInt();
		int c=sc.nextInt();
		int p=search(a,c);
		p=Math.min(p,b);
		int cn=-1;
		for(int j=0;j<p;j++){
			a[j]=a[j+p];
			a[j+p]=c;
		}
      }
	  	long sum=0;
		for(int i=0;i<n;i++){
			sum+=a[i];
		}
      System.out.println(sum);
    }
}