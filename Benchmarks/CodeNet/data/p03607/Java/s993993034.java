import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scn.nextInt();
		}
      	Arrays.sort(a);
      	int c = a[0];
    	int count = 0;
    	int ans =0;
    	for(int i=0;i<n;i++){
      		if(c==a[i]){
       			count++;
      		}else{
        		c = a[i];
        		if(count%2==1){
          			ans++;
        		}
        		count=1;
      		}
    	}
     	System.out.println(ans);
	}
}