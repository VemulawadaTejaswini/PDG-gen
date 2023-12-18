import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    int[]a = new int[N];
 
    int all = 0;		
    for(int i=0; i<N; i++) {
    	a[i] = L+i;
    	all += a[i];
    a[i] = Math.abs(a[i]); 
    }
    Arrays.sort(a);

    	
    	
    if(L+N-1<0) {
    	System.out.println(all+a[0]);
    }else {
    	System.out.println(all-a[0]);
    }
}
}