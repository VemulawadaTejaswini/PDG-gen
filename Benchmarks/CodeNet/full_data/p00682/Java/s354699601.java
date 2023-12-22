import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int count = 0;

	while(n!=0){
	    count++;
	    int[] x = new int[n];
	    int[] y = new int[n];
	    for(int i=0; i<n; i++){
		x[i] = sc.nextInt();
		y[i] = sc.nextInt();
	    }

	    double[] pro = new double[n];
	    for(int i=0; i<n-1; i++){
		pro[i] = (x[i]-x[i+1])*(y[i]+y[i+1]);
	    }
	    pro[n-1] = (x[n-1]-x[0])*(y[n-1]+y[0]);
	    double ans = 0;
	    for(int i=0; i<n; i++){
		ans += pro[i];
	    }

	    System.out.println(count+" "+(-ans/2.0));

	    n = sc.nextInt();
	}
    }
}