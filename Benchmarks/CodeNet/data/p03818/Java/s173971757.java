import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] a = new int[100005];
    	for(int i=0;i<N;i++) {
    		a[sc.nextInt()]++;
    	}
    	long ans=0;
    	int ecnt=0;
    	for(int i=0;i<100005;i++) {
    		if(a[i]==0)continue;
    		ans=ans+a[i]-1;
    		ecnt=ecnt+((a[i]+1)%2);
    	}
    	ans=ans+(ecnt%2);
    	
        System.out.println(N-ans);
        
        		
    }
}