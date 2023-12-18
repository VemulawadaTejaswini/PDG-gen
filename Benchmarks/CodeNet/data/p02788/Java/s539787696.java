import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long D = sc.nextLong();
        long A = sc.nextLong();
        long[][] XH = new long[N][3];
        
        long cnt=0;
        for(int i=0;i<N;i++) {
        	XH[i][0]=sc.nextLong();
        	XH[i][1]=sc.nextLong();
        }
        
        Arrays.sort(XH, (b, c) -> Long.compare(b[0], c[0]));
        
        for(int i=0;i<N-1;i++) {
        	int low=i;
        	int up=N-1;
        	int flg=0;
        	while(low<=up) {
            	int mid=(low+up)/2;
            	if(mid==N-1) {
        			XH[i][2]=mid;
        			flg=1;
        			break;
            	}
        		if(XH[mid][0]-XH[i][0]<=2*D&&2*D<XH[mid+1][0]-XH[i][0]) {
        			XH[i][2]=mid;
        			flg=1;
        			break;
        		}else if(2*D<XH[mid][0]) {
        			up=mid-1;
        			flg=-2;
        		}else {
        			low=mid+1;
        			flg=-1;
        		}
        	}
        	if (flg!=1) {
        		if(2*D>XH[N-1][0]-XH[i][0]) {
        			XH[i][2]=N-1;
        		}else {
        			XH[i][2]=i;
        		}
        		
        		//System.out.println("エラー"+i);
        	}
        	
        	
        }
        long damege=0;
    	for(int i=0;i<N;i++) {
    		if(XH[i][1]>0) {
				if(XH[i][1]%A==0) {
					damege=XH[i][1];
				}else {
					damege=(XH[i][1]/A)*A+A;
				}
    			for(int j=i;j<=XH[i][2];j++) {
    				XH[j][1]=XH[j][1]-damege;
    			}
				cnt=cnt+damege/A;
    		}
    	}
        
        System.out.println(cnt);        	
                		
    }
    
    
}