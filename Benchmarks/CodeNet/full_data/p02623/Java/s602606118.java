import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();
    long[] a = new long[n];
    long[] b = new long[m];
    long time=0;
    int x =0,y=0,count=0;

    for(int i=0;i<n;i++) {
    	a[i] = sc.nextLong();
    	}
    for(int i=0;i<m;i++) {
    	b[i] = sc.nextLong();
    	}

    for(int c=0;c<n+m;c++) {
    	time+=Math.min(a[x], b[y]);
    	if(k<time)break;
    	else {
    		count++;
    		if(a[x]>b[y]) {
    			y++;
    			if(y==b.length)break;
    		}
    		else {
    			x++;
    			if(x==a.length)break;
    		}
    	}
    }
    for(int c=0;c<n+m;c++) {
    	if(x==a.length){
    		time+=b[y];
    		count++;
    		y++;
    		if(y==b.length)break;
    	}
    	else if(y==b.length){
    		time+=a[x];
    		count++;
			x++;
			if(x==a.length)break;
		}
    }
    System.out.println(count);
  }
}