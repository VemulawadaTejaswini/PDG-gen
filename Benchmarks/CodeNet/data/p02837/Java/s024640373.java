import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][][] x = new int[N][N][2];
        int[] A=new int[N];
        int max=0;
        
        for(int i=0;i<N;i++) {
        	A[i] = sc.nextInt();
        	for(int j=0;j<A[i];j++) {
        		x[i][j][0]= sc.nextInt()-1;
        		x[i][j][1]= sc.nextInt();
        	}
        }
        int[] p = new int[N];
        
        for(int i=0;i<Math.pow(2, N);i++) {
    		int tmp=i;
        	for(int j=0;j<N;j++) {
        		if(tmp%2==0) {
        			p[j]=0;
        		} else {
        			p[j]=1;
        		}
        		tmp=tmp/2;
        	}
        	
    		boolean flg=true;
        	for(int j=0;j<N;j++) {
        		if(p[j]==1) {
        			for(int k=0;k<A[j];k++) {
        				if(p[x[j][k][0]]!=x[j][k][1]) {
        					flg=false;break;
        				}
        				
        			}
        			
        		}
        	}
    		if(flg==true) {
    			int cnt=0;
    			for(int k=0;k<N;k++) {
    				if(p[k]==1) {
    					cnt++;
    				}
    			}
    			max=Math.max(max, cnt);
    		}
        	
        }
        
        
        System.out.println(max);
        		
    }
}