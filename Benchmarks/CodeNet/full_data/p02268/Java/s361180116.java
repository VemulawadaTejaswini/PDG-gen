import java.util.*;

public class Main{
	static 	long search(long[] lst,long key){
		int left = 0 ;
		int right = lst.length;
		int mid ;
		while(left < right){
			mid = (left + right) / 2 ;
			if(lst[mid] == key) return mid;
			else if(lst[mid] < key)left = mid +1 ;
			else if(key < lst[mid])right = mid;
		}
		return -1 ;
	}
	
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    long[] lst = new long[n];
	    for(int i=0;i<n;i++)lst[i]=sc.nextLong();
	    
	    int q=sc.nextInt();
	    int sum=0;
	    
	    for(int i=0;i<q;i++){
	        if(search(lst,sc.nextLong())>=0)sum++;
	    }
	    
	    System.out.println(sum);
	}
}
