import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N =sc.nextInt();
	    int D = sc.nextInt();
	    int X[][]=new int[N][D];
	    for(int i=0;i<N;i++) {
	    	for(int j=0;j<D;j++) {
	    		X[i][j]=sc.nextInt();
	    	}
	    }
	    int c=0;
	    for(int i=0;i<N;i++) {
	    	for(int j=i+1;j<N;j++) {
	    		int d =dist2(X[i], X[j]);
	    		double ds = Math.sqrt(d);
	    		if(ds==(int)ds) {
	    			c++;
	    		}
	    	}
	    }
	    System.out.println(c);

	}

	static int dist2(int a[],int b[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=(a[i]-b[i])*(a[i]-b[i]);
		}
		return sum;
	}


}