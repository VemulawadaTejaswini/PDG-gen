//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

   class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int a[] = new int[n];
    	int b[] = new int[n];
    	int c[] = new int[m];
    	int d[] = new int[m];
    	int dist=0;
    	int min[] = new int[2];
    	List<Integer> ans = new ArrayList<Integer>();
    	for(int i=0;i<n;i++) {
    		a[i]=sc.nextInt();
    		b[i]=sc.nextInt();
    	}
    	for(int i=0;i<m;i++) {
    		c[i]=sc.nextInt();
    		d[i]=sc.nextInt();
    	}
    	for(int i=0;i<n;i++) {
    		Arrays.fill(min, 100000);
    		for(int j=0;j<m;j++) {
    			dist=Math.abs(a[i]-c[j])+Math.abs(b[i]-d[j]);
    			if(dist<min[0]) {
    				min[0]=dist;
    				min[1]=j+1;
    			}
    		}
    		ans.add(min[1]);
    	}
    	for(int i=0;i<n;i++) {
    		System.out.println(ans.get(i));
    	}
    }
}