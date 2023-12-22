import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			String[] chairs = new String[n];
			for(int i = 0; i < n; i++){
				chairs[i] = "#";
			}
			
			for(int i = 0; i < m; i++){
				String str = sc.next();
				
				if("A".equals(str)){
					
					for(int j = 0; j < n; j++){
						if(chairs[j].equals("#")){
							chairs[j] = "A";
							break;
						}
					}
					
				}else if("B".equals(str)){
					boolean found = false;
					
					for(int j = n-1; j >= 0; j--){
						if((j == (n-1) || !chairs[j+1].equals("A")) && (j == 0 || !chairs[j-1].equals("A"))){
							found = true;
							chairs[j] = "B";
							break;
						}
					}
					
					if (found == false) {
						for (int j = 0; j < n; j++) {
							if (chairs[j].equals("#")) {
								chairs[j] = "B";
								break;
							}
						}
					}
					
				}else if("C".equals(str)){
					boolean found = false;
					
					for (int j = 0; j < n; j++) {
						if (!chairs[j].equals("#") && j != (n-1) && chairs[j+1].equals("#")) {
							found = true;
							chairs[j+1] = "C";
							break;
						}
					}
					
					if(found == false){
						if(n % 2 == 1){
							chairs[(n+1)/2] = "C";
						}else{
							chairs[n/2+1] = "C";
						}
					}
					
				}else if("D".equals(str)){
					int[] tmp_array = new int[n];
					int max = 0;
					boolean found = false;
					
					for(int j = 0; j < n; j++){
						if(chairs[j].equals("#")){
							tmp_array[j] = Integer.MAX_VALUE;
						}else{
							tmp_array[j] = 0;
							found = true;
						}
					}
					
					if(found == false){
						max = Integer.MAX_VALUE;
					}
					
					boolean fixed = false;
					for(int j = 0; j < n; j++){
						for(int k = 0; k < n; k++){
							if(tmp_array[k] == j){
								if(k != 0 && tmp_array[k-1] > (j + 1)){
									tmp_array[k-1] = j + 1;
									fixed = true;
								}
								
								if(k != (n-1) && tmp_array[k+1] > (j + 1)){
									tmp_array[k+1] = j + 1;
									fixed = true;
								}
							}
						}
						
						if(fixed == false){
							break;
						}else{
							fixed = false;
							max = j+1;
						}
					}
					
					for(int j = 0; j < n; j++){
						if(tmp_array[j] == max){
							chairs[j] = "D";
							break;
						}
					}
				}
			}
			
			for(int j = 0; j < n; j++){
				System.out.print(chairs[j]);
			}
			System.out.println();
			
			
		}
		
	}
	
}