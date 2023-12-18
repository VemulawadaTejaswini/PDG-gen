import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int M = 0;
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		for(int i=N-1;i>-1;i--) {
			if(a[i]%2==1) {
				b[i]=1;
				M++;
				for(int j=0;j<i-1;j--) {
					if(i%j==0) {
						a[j]++;
					}
				}
			}
		}
		
        System.out.println(M);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			if(b[i]==1) {
				if(i==N-1) {
					sb.append(i+1);
				} else {
					sb.append(i+1);				
					sb.append(" ");
				}
			}
		}
        System.out.println(sb);
    }
}