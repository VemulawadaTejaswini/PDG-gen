import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int ar[] = new int[N];
		List<Integer> sums = new ArrayList<>();
		int keta[] = new int[30];
		Arrays.fill(keta,0);

		for(int n=0;n<N;n++){
			int v = sc.nextInt();
			if(n==0){
				ar[n] = v;
			}
			else{
				ar[n] = ar[n-1]+v;
			}
			sums.add(ar[n]);

			int k = Integer.toBinaryString(ar[n]).length();
			keta[k-1]++;
		}
		for(int n=0;n<N;n++){
			for(int m=n+1;m<N;m++){
				int v = ar[m]-ar[n];
				if(sums.indexOf(v) == -1){
					sums.add(v);
					int k = Integer.toBinaryString(v).length();
					keta[k-1]++;
				}
			}
		}
		Collections.sort(sums, Collections.reverseOrder());

		int k,ans=0;
		while(true){
			
        for(k=29;k>0;k--){
   	    	if(keta[k]>=A) break;
   	    }
   	   	if(k==0) break;
   	    sums = sums.subList(0,keta[k]);
   	    int ket = keta[k];
   	    Arrays.fill(keta,0);
   	    
        if(ket==A) break;

        	for(int a=0;a<ket;a++){
        		sums.set(a,sums.get(a)-2<<(k-1));
        		keta[Integer.toBinaryString(ar[a]).length()-1]++;
        	}
        
    	}

        for(int a=0;a<A;a++){
        	if(a==0) ans = sums.get(a);
        	else ans = ans & sums.get(a);
        }
        System.out.println(ans);

	}
}