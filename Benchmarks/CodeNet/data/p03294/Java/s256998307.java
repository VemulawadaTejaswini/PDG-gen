import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        
        
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int a[] =new int[N];
		int b[] =new int[N];
		int m=0;
		
		
		for(int i=0;i<N;i++){
		    a[i]=sc.nextInt();
		    b[i]=a[i];
		}
		for(int i=0;i<N;i++){
		    b[i]-=1;
		}
		for(int i=0;i<N;i++){
		    m+=b[i];
		}
		
		System.out.println(m);
		
		
	}
}
