import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a=new int[n];
		long[] g=new long[n+1];
      	int al=0;
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
          	al+=g[a[i]];
          	g[a[i]]++;
		}
      	long all=0;
      	for(int i=0;i<n;i++){
          all+=(g[i]*(g[i]-1))/2;
          //System.out.println(x);
        }  
      	//System.out.println(all);
		//System.out.println(al);

		for(int i=0;i<n;i++){
			System.out.println(all-g[a[i]]+1);
		}
		
	}
}
