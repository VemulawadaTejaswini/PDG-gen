import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();

	int n_nums[] = new int[n];
    int m_nums[] = new int[m];
    for(int i = 0; i < n; i++){
		n_nums[i] = sc.nextInt();    
    }
    
     for(int i = 0; i < m; i++){
		m_nums[i] = sc.nextInt();    
    }
    
    int ns = 0,ms = 0;
    int sum = 0;
    
    while(true){
      	int tmp = 0;
      
      	if(n_nums[ns] > m_nums[ms]){
        	if(m_nums.length > ms)
        		tmp = m_nums[ms++];
          	else
            	tmp = n_nums[ns++];
        }else if(n_nums[ns] < m_nums[ms]){
          	if(n_nums.length > ns)
        		tmp = n_nums[ns++];
          	else
              	tmp = m_nums[ms++];
        }
      
    	if(sum+tmp > k){
        	break;
        }else{
        	sum += tmp;
        }
    }
    
    
  }
}