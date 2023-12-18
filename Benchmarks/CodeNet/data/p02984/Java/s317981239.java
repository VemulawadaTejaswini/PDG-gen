import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[3*N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();	
            A[N+i]=A[i];
        }
       
        
        
        int[] ans = new int[N];
        for(int i=0; i<N; i++) {
        	ans[i]=0;
        	for(int j=i; j<N+i; j++) {
        		if((j-i)%2==0) {
        			ans[i]=ans[i]+A[j];
        		}else {
        			ans[i]=ans[i]-A[j];        			
        		}
        	}
        	ans[i] = ans[i];
        }
        
        String s ="";
        for(int i=0; i<N; i++) {
        	s = s + " " + ans[i];
        }

        	System.out.println(s);
    }
}
