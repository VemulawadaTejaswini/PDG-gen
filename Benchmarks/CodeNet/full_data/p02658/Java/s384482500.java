import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	long[] A = new long[N];
	boolean flag = true;
	for(int i=0;i<N;i++){
	    A[i] = sc.nextLong();
	    if(A[i]==0){
		flag=false;
		break;
	    }
	}
	
	long ans = 1;

	if(flag){
	    for(int i=0;i<N;i++){
		ans *= A[i];
		if(ans > (long)Math.pow(10,9)*(long)Math.pow(10,9)){
		    ans = -1;
		    break;
		}
	    }
	}else{
	    ans = 0;
	}
        
	System.out.print(ans);
    }
}
