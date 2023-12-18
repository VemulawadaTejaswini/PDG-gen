import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
    
      	Scanner sc = new Scanner(System.in);
      	int N = Integer.parseInt(sc.nextLine());
      	String[] strB = sc.nextLine().split("\\s");
      	
      	int[] A = new int[N];
       	
      	for(int i = 0; i < N - 1; i++){
      	    int B = Integer.parseInt(strB[i]);
      	    
      	    A[i+1] = B;
      	    if( (i == 0) || (A[i] > B) ) A[i] = B;
      	}
      	
      	int sum = Arrays.stream(A).sum();
      	
      	System.out.println(sum);
      	
    }
}