public class Main {

	public static void main(String[] args) {
		solve2440();
	}

	public static void solve2440() {
		Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int p = sc.nextInt();
            int pfst = p;
            int out = 0;
            if(0 == n&&0 == p){
                break;
            }
            int[] s = new int[n];
            int i = 0;
            while(true){
            	if(s[i]>0&p>0) {
		        	s[i]+=1;
		        	p-=1;
		        }
            	else if(s[i]==0&p>0) {
		        	s[i]+=1;
		        	p-=1;
		        }
            	else if(p==0&s[i]==0) {

		        }
            	else if(p==0&s[i]>0) {
		        	p=s[i];
		        	s[i]=0;
		        }

	        	for(int j=0;j<n;j++) {
	        		if(s[j]==pfst) {
	        			System.out.println(j);
	        			pfst = 0;
	        			break;
	        		}
	        	}

		        if(pfst==0) {
		        	break;
		        }
		        i++;
		        if(i==n) {
		        	i=0;
		        }
            }
        }

	}

}
