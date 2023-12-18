import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

  		long[] a=new long[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextLong();
    	}
  		long[] a2=new long[n*(n-1)/2];
         int k1=0;
  		for(int d=0;d<n-1;d++){
        for(int e=d+1;e<n;e++){
        	a2[k1]=a[d]*a[e];
          	k1++;
        }
        }
    
 	Arrays.sort(a2);
    	System.out.println(a2[k-1]);
    }
}
