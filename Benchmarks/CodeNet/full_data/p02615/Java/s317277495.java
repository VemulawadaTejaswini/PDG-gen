import java.util.*;

public class Main{
    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	Integer A[]= new Integer[N];
	int ans=0;
	
	for(int i=0; i<N; i++){
	    A[i]=sc.nextInt();
	}
	Arrays.sort(A, Comparator.reverseOrder());
	ans=A[0];
	for(int i=2; i<N;i++){
	  ans=ans+A[i/2];
	  }
	System.out.println(ans);
	
    }
}
