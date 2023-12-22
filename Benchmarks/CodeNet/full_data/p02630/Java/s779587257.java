import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    int max=0;
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    	max=Math.max(max, a[i]);
	    }
	    int q=sc.nextInt();
	    int[] b=new int[q];
	    int[] c=new int[q];
	    for(int i=0;i<q;i++) {
	    	b[i]=sc.nextInt();
	    	c[i]=sc.nextInt();
	    	max=Math.max(max, b[i]);
	    	max=Math.max(max, c[i]);
	    }
	    long sum=0;
	    int[] count =new int[max];
	    for(int i=0;i<n;i++) {
	    	count[a[i]-1]++;
	    	sum+=a[i];
	    }
	    for(int i=0;i<q;i++) {
	    	if(b[i]>max | c[i]>max)continue;
	    	int num=count[b[i]-1];
	    	count[b[i]-1]=0;
	    	count[c[i]-1]+=num;
	    	sum+=(c[i]-b[i])*num;
	    	System.out.println(sum);
	    }
	    
	}
}
