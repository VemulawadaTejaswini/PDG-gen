import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j,n,q;
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
	    	for(j=0;j<n;j++){
	    		if(T[i]==S[j]){
	    			cnt++;
	    			break;
	    		}
	    	}
	    }
		
	    System.out.println(cnt);
	}

}
