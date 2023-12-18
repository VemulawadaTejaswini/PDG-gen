	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static int E;
		 static int F;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int A = 100*sc.nextInt();
	        int B = 100*sc.nextInt();
	        int C = sc.nextInt();
	        int D = sc.nextInt();
	        E = sc.nextInt();
	        F = sc.nextInt();
	        boolean[] a = new boolean[40];
	        for(int i=0;A*i<=F;i++) {
	        	for(int j=0;A*i+B*j<=F;i++) {
	        		a[(A*i+B*j)/100]=true;
	        	}
	        }
	        boolean[] bi = new boolean[3005];
	        for(int i=0;C*i<F;i++) {
	        	for(int j=0;C*i+D*j<F;j++) {
	        		bi[C*i+D*j]=true;
	        	}
	        }
	        int cnt=0;
	        int[] b = new int[3005];
	        for(int i=0;i<3005;i++) {
	        	if(bi[i]==true) {
	        		b[cnt]=i;
	        		cnt++;
	        	}
	        }
	        	        
	        Arrays.sort(b);
	        double max = -1;
	        String ans ="";
	        for(int i=1;i<40;i++) {
	        	if(a[i]==false)continue;
	        	int w = i*100;
	        	int l=-1;
	        	int r=3005;
	        	while(r-l>1) {
	        		int m = l+(r-l)/2;
	        		int s = b[m];
	        		if(Isok(w,s)==true) {
	        			l=m;
	        		} else {
	        			r=m;
	        		}
	        	}
	        	double t=0;
	        	if(l>=0&&l<3005) {
	        		t = 100.0*b[l]/(i*100+b[l]);
	        	} 
	        	if(max<t) {
	        		ans=(i*100+b[l]) + " " + b[l];
	        		max=t;
	        	}
	        }
	        
	        System.out.println(ans);
	    }
		 
		static boolean Isok(int a,int b) {
			double p=E*a/100;
			int w=a+b;
			if(p<b)return false;
			if(w>F)return false;
			
			return true;
		}
	}