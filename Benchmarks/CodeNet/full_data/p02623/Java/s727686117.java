import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	long k = sc.nextLong();
      
      	long[] n1 = new long[n];
      	long[] m1 = new long[m];
      
      	for(int i = 0; i < n; i++){
        	n1[i] = sc.nextLong();
        }
      	for(int i = 0; i < m; i++){
        	m1[i] = sc.nextLong();
        }
      	int cnt = 0;
      	int i = 0, j = 0;
      	if(k < n1[0] && k < m1[0]){
        	System.out.println(0);
        }else{
          	for(long l = 0; l < k;){
        		if( n1[i] < m1[j]){
            		l += n1[i];
                  	i++;
                  	if(n < i){
                    	i--;
                      	n1[i] = 1000000000;
                    }else{
                    	cnt++;
                    }
           		}else{
                	l += m1[j];
                  	j++;
                  	if(m < j){
                    	j--;
                    	n1[j] = 1000000000;
                    }else{
                    	cnt++;
                    }
                    
                }
          	}
          	System.out.println(cnt);
        }
    }
}