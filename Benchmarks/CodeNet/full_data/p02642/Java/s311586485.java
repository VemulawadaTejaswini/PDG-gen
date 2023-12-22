import java.util.*;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0 ; i<n ; i++) {
        	num[i] = sc.nextInt();
        	 //System.out.println(num[i]);
        }
        int cnt = 0;
        int k = 0;
        for(int i=0; i<n; i++) {
        	k=0;
        	for(int j=0; j<n; j++) {
        		if(i!=j && num[i] % num[j] == 0) {
        			cnt=cnt;
        			//break;
        		}else {
        			k++;
        			//System.out.println(k);
        		}
        	}
        	if(k==n) cnt++;
        }
        
      
       
        System.out.println(cnt);
}

}