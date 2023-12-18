	import java.util.*;

	public class Main{
			
			public static void main(String args[]){
			
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				
				int heights[] = new int[n];
				
				for(int i = 0; i < n; i++){
					
					heights[i] = sc.nextInt();
					
				}
				
				int flag = 1;
				
				for(int i = n-1; i > 0 ; i--) {
						
					if(heights[i] < heights[i-1]){

						heights[i-1]-=1;
						
						if(heights[i] < heights[i-1]){
	
							flag = 0;
							break;
						
						} else {
							
							continue;		
						
						}
						
					} else {

							continue;
				
					}						
				
				}
					
					if(flag == 1){
						
						System.out.println("Yes");
						
					} else {
						
						System.out.println("No");
						
					}
				
			
			}
	}