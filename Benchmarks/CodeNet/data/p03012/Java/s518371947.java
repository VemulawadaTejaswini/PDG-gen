import java.util.Scanner;                                                                                            
                                                                                                                     
public class Main {                                                                                                  
	public static void main(String[] args) {                                                                         
		Scanner sc = new Scanner(System.in);                                                                         
                                                                                                                     
		int num = sc.nextInt();                                                                                      
                                                                                                                     
		int[] input = new int[num];                                                                                  
		for (int i = 0; i < num; i++) {                                                                              
			input[i] = sc.nextInt();                                                                                 
		}                                                                                                            
                                                                                                                     
		sc.close();                                                                                                  
                                                                                                                     
		int[] re = new int[num - 1];                                                                                 
		for (int i = 0; i < num - 1; i++) {                                                                          
			int a = 0;                                                                                               
			int b = 0;                                                                                               
			for (int j = 0; j < i + 1; j++) {                                                                        
				a += input[j];                                                                                       
			}                                                                                                        
			for (int k = i + 1; k < num; k++) {                                                                      
				b += input[k];                                                                                       
			}                                                                                                        
			if (a > b) {                                                                                             
				re[i] = a - b;                                                                                       
			} else {                                                                                                 
				re[i] = b - a;                                                                                       
			}                                                                                                        
		}                                                                                                            
                                                                                                                     
		int min = 1000;                                                                                              
		for (int i : re) {                                                                                           
			min = Math.min(min, i);                                                                                  
		}                                                                                                            
		System.out.println(min);                                                                                     
                                                                                                                     
	}                                                                                                                
                                                                                                                     
}                                                                                                                    
                                                                                                                     