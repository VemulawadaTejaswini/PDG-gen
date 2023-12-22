import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int c = 0;

	    while(true){
		c++;
		int n = sc.nextInt();
		if(n==0) break;
		double a[][] = new double[n][2];
		for(int i=0 ;i<n ;i++){
		    a[i][0] = sc.nextDouble(); //x
		    a[i][1] = sc.nextDouble(); //y
		}
		double s = 0;
		for(int i=0;i<n-1;i++){
		    //    s += ((a[i][0]-a[i+1][0])*(a[i][1]+a[i+1][1]))/2;
		    s += (a[i][0]*a[i+1][1]-a[i][1]*a[i+1][0])/2;
		}
		s += (a[n-1][0]*a[0][1]-a[n-1][1]*a[0][0])/2;
	
		if(s<0){
		    s*=-1;
		}
		//System.out.print("%d %.1f",c,s);
		System.out.println(c+" "+s);
	    }
    }
}