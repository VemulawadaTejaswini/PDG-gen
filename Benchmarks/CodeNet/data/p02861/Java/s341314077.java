import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double l=0;
  		int[] x=new int[n];
  		int[] y=new int[n];
  		for(int c=0;c<n;c++){
    		x[c]=sc.nextInt();
          	y[c]=sc.nextInt();
    	}
    	
  		for(int c=0;c<n;c++){
          for(int d=c+1;d<n;d++){
            l+=Math.sqrt(Math.pow(x[c]-x[d],2)+Math.pow(y[c]-y[d],2));
          }
        }
 	   double ans=l*2/n;

    	System.out.println(ans);
    }
}