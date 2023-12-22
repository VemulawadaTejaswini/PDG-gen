import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j,n,q,mid,left,right;
		int cnt=0;
		n = sc.nextInt();
		int [] S = new int [n];
		for(i=0;i<n;i++){
			S[i] = sc.nextInt();
		}
		q = sc.nextInt();
		int [] T = new int[q];
		for(i=0;i<q;i++){
			T[i] = sc.nextInt();
		}
		
	    for(i=0;i<q;i++){
	    	left =0;
	    	right = S.length;
	    	while(left < right){
	    		 mid = (left + right)/2;
	    		 if(T[i]==S[mid]){
	    			 cnt++;
	    			 break;
	    		 }
	    		 if(T[i]>S[mid]) left = mid +1;
	    		 else if(T[i] < S[mid])  right = mid;
	    	}
	    }
		
	    System.out.println(cnt);
	}

}
