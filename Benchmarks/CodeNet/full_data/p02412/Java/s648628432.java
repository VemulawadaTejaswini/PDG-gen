import java.util.*;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner as = new Scanner(System.in);
		int n,x,i,j,k,t;
		int s = 0;
		int o = 0;
		int f = 0;
		String str;
		
		while(true){
			
			n = as.nextInt();
			x = as.nextInt();
			
			if(n == 0 && x == 0){
				break;
			}
			
			for(i=1;i<=n;i++){
				for(j=1;j<=n;j++){
					for(k=1;k<=n;k++){
						
						f++;
						//System.out.println(f);
						
						if(i != j && j != k && i != k){
							
							o++;
							//System.out.println(o);
								
							if((i+j+k) == x){
								
								s++;
								
							}
								
						}
							
					}	
				}	
			}
			
			str=String.valueOf(s/6);
			System.out.println(str);
			
		}
		
		

	}

}